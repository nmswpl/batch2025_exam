package in.co.nmsworks.test;

public class LandShipping implements ShippingMethod{
    @Override
    public double getBaseDistance() {
        return 100;
    }

    @Override
    public double getBaseWeight() {
        return 2;
    }

    @Override
    public double getBasePrice() {
        return 5;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if(distance <= this.getBaseDistance()){
            return distance*this.getBasePrice();
        }
        else if(distance > this.getBaseDistance() && distance <= 300){
            double distanceRemaining = distance-this.getBaseDistance();
            double price = (this.getBasePrice()*this.getBaseDistance()) + (distanceRemaining*20);
            return price;
        }
        else if(distance > 300 && distance <= 700){
            double distanceRemaining = distance-(this.getBaseDistance()+200);
            double price = (this.getBasePrice()*this.getBaseDistance()) + (200*20) +(distanceRemaining*30);
            return price;
        }
        else{
            double distanceRemaining = distance-(this.getBaseDistance()+200+400);
            double price = (this.getBasePrice()*this.getBaseDistance()) + (200*20) + (400*30)+ (distanceRemaining*35);
            return price;
        }
    }

    @Override
    public double additionalWeightCost(double weight) {
        if(weight <= this.getBaseWeight()){
            return weight*this.getBasePrice();
        }
        else if(weight > this.getBaseWeight() && weight <= 10){
            double distanceRemaining = weight-this.getBaseDistance();
            double price = (this.getBasePrice()*this.getBaseDistance()) + (distanceRemaining*10);
            return price;
        }
        else if(weight > 5 && weight <= 15){
            double distanceRemaining = weight-(this.getBaseDistance()+5);
            double price = (this.getBasePrice()*this.getBaseDistance()) + (3*10) +(distanceRemaining*15);
            return price;
        }
        else{
            double distanceRemaining = weight-(this.getBaseDistance()+5+10);
            double price = (this.getBasePrice()*this.getBaseDistance()) + (3*10) + (10*15)+ (distanceRemaining*20);
            return price;
        }
    }
}
