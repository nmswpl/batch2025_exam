package in.co.nmsworks.Exam;

import com.google.gson.Gson;

public class GSONExample {

    public static void main(String[] args) {
        Parcel parcel = new Parcel(70,80);
        parcel.setLatLongTo(new int[]{1, 2});
        Gson gson = new Gson();
        System.out.println(gson.toJson(parcel));
        String jsonStr = "{\"weight\":70,\"distance\":80,\"latLongTo\":[1,2]}";
        Parcel parcel1 = gson.fromJson(jsonStr, parcel.getClass());
        System.out.println(parcel1);
    }
}
