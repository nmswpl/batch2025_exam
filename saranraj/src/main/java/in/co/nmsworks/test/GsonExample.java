package in.co.nmsworks.test;

import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(15, 1200);
        Gson gson = new Gson();

        parcel.setLatLong(new int[]{20, 30});


        System.out.println(gson.toJson(parcel));
        String jsonStr = "{\"weight\":15.0,\"distance\":1200.0,\"latLong\":[20,30]}\n";
        Parcel fromGson =gson.fromJson(jsonStr,Parcel.class);

        System.out.println(fromGson);

    }
}
