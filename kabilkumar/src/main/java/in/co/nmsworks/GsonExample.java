package in.co.nmsworks;

import com.google.gson.Gson;

public class GsonExample
{
    public static void main(String[] args) {

        Parcel p =  new Parcel(200,233);
        Gson gson = new Gson();
        System.out.println(gson.toJson(p));
        p.setToLatLong(new  int[]{22,44});
        System.out.println(gson.toJson(p));

        String jsonStr = "{\"weight\":200,\"distance\":233,\"toLatLong\":[0,0]}";
        System.out.println(jsonStr);
        Parcel parcel = gson.fromJson(jsonStr, p.getClass());
        System.out.println(parcel);



    }
}
