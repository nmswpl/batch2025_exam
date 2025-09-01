package in.co.nmsworks.javaexam;

import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {

        Parcel parcel = new Parcel(15,1200, new int[]{20, 40});

        Gson gson = new Gson();
        System.out.println(gson.toJson(parcel));

        String jsonInput = "{weight:15.0,distance:1200.0,LatLonto:[20,40]}";

        Parcel parcelj1 = gson.fromJson(jsonInput, Parcel.class);

        System.out.println("Parsed object: " + parcelj1);
    }

}
