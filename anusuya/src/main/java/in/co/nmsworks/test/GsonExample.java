package in.co.nmsworks.test;

import com.google.gson.Gson;

public class GsonExample {

    public static void main(String[] args) {

        Parcel parcel = new Parcel();
        parcel.setWeight(10);
        parcel.setDistance(20);
        parcel.setLatLongTo(new int[]{22,23});

        Gson gson = new Gson();

        //System.out.println(gson.toJson(parcel));
        
        String jsonStr = "{\"weight\":10.0,\"distance\":20.0,\"totalCost\":0.0,\"latLongTo\":[22,23]}";
        Parcel p1 = gson.fromJson(jsonStr, parcel.getClass());
        System.out.println(p1.toString());
        System.out.println(p1.getLatLongTo()[0]);
    }
}
