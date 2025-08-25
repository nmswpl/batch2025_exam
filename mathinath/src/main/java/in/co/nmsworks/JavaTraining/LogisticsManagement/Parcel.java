package in.co.nmsworks.JavaTraining.LogisticsManagement;

public class Parcel {
    int weight;
    int distance;
    int basePrice;

    public Parcel(int weight, int distance, int basePrice) {
        this.weight = weight;
        this.distance = distance;
        this.basePrice = basePrice;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }
}
