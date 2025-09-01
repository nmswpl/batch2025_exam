package in.co.nmsworks.exam.logisticsManagement;

import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(50,100);
        parcel.setLatLongTo(new int[]{164, 145});
        Gson gson = new Gson();
        System.out.println(gson.toJson(parcel));
        String jsonStr = "{\"weight\":50,\"distance\":100,\"latLongTo\":[164,145]}";

        Parcel p1 = gson.fromJson(jsonStr,Parcel.class);
        System.out.println(p1);
    }
}
