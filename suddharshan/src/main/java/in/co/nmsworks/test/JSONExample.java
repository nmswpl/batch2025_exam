package in.co.nmsworks.test;

import com.google.gson.Gson;

public class JSONExample {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(5,100);
        Gson gson = new Gson();
        System.out.println(gson.toJson(parcel));
        String jsonStr = "{\"weight\":100.0,\"distance\":900.0}";
        Parcel parcel1 = gson.fromJson(jsonStr, Parcel.class);
        System.out.println("Distance: "+parcel1.getDistance() + " Weight: " + parcel1.getWeight());
    }
}
