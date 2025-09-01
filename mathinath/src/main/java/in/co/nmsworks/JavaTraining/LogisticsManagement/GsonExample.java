package in.co.nmsworks.JavaTraining.LogisticsManagement;

import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(10,100);
        parcel.setLatLongTo(new int[]{20,10});
        Gson gson = new Gson();
        System.out.println(gson.toJson(parcel));
        String jsonStr = "{\"weight\":10,\"distance\":100,\"latLongTo\":[20,10]}";
        Parcel p1 = gson.fromJson(jsonStr,parcel.getClass());
        System.out.println(p1);
    }
}
