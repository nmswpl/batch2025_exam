package in.co.nmsworks.test;

import com.google.gson.Gson;

public class GSONExample {
    public static void main(String[] args) {
     Parcel parcel = new Parcel(30.0,"125km ");
     parcel.setLatLongTo(new int[]{22,33});
     Gson gsonExample = new Gson();
        System.out.println(gsonExample.toJson(parcel));
        String jsonStr = "{\"weight\":30.0,\"distance\":\"125km \",\"latLongTo\":[22,33]}\n";
        Parcel jsonPerson = gsonExample.fromJson(jsonStr, Parcel.class);
        System.out.println(jsonPerson);
    }
}
