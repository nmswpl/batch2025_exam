package in.co.nmsworks.week4.day2;

import com.google.gson.Gson;
import in.co.nmsworks.test.Parcel;

public class GsonExample
{
    public static void main(String[] args)
    {
        Parcel parcel = new Parcel(10, 20);
        parcel.setLatLongTo(new int[] {22, 34});
        Gson gson = new Gson();
        System.out.println(gson.toJson(parcel));

        String jsonStr = "{\"weight\":10.0,\"distance\":20.0,\"latLongTo\":[22,34]}";

        Parcel jsonPerson = gson.fromJson(jsonStr, Parcel.class);
        System.out.println(jsonPerson);
    }
}
