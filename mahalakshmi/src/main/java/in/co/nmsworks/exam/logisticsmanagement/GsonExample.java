package in.co.nmsworks.exam.logisticsmanagement;

import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(20,1500);
        parcel.setToLatLong(new int[]{45,78});
        Gson gson = new Gson();
        String json = gson.toJson(parcel);
        System.out.println(json);

        String jsonStr = "{\"weight\":20.0,\"distance\":1500.0,\"toLatLong\":[45,78]}";
        System.out.println(jsonStr);

        Parcel parcel1 = gson.fromJson(jsonStr, Parcel.class);
        System.out.println(parcel1);
    }
}
