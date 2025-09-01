package in.co.nmsworks;

import com.google.gson.Gson;

public class GsonExample
{
    public static void main(String[] args) {
        Parcel parcel = new Parcel(20,25);
        parcel.setLatLongTo(new int[] {22,25});
        Gson gson = new Gson();
        System.out.println(gson.toJson(parcel));

        String jsonstr = "{\"weigth\":20,\"distance\":25,\"latLongTo\":[22,25]}";
        Parcel parcel1 = gson.fromJson(jsonstr, Parcel.class);
        System.out.println(parcel1);
    }
}
