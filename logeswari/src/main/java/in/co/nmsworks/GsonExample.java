package in.co.nmsworks;

import com.google.gson.Gson;

import java.util.Arrays;

public class GsonExample {
    public static void main(String[] args) {
        Parcel parcel=new Parcel(3,40);
        Gson gson=new Gson();
        System.out.println(gson.toJson(parcel));

        parcel.setLatLonto(new int[]{22,23});
        System.out.println(Arrays.toString(parcel.getLatLonto()));

        String json=gson.toJson(parcel);
        System.out.println("parcel : "+json);

        String jsona="{\"weight\":3,\"distance\":40.0}";
        Parcel from=gson.fromJson(json, Parcel.class);
        System.out.println(from);

        System.out.println(from.toString());

    }
}
