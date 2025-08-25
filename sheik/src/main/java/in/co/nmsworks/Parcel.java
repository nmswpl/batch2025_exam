package in.co.nmsworks;

public class Parcel {
    int weigth;
    int distance;

    Parcel p = new Parcel();

    public Parcel(int weigth, int distance) {
        this.weigth = weigth;
        this.distance = distance;
    }

    public Parcel() {

    }

    public int getWeigth() {
        return weigth;
    }

    public int getDistance() {
        return distance;
    }
}
