package in.co.nmsworks.test;

public class AirShipping implements ShippingMethod{
    @Override
    public double getBaseDistance() {
        return 300;
    }

    @Override
    public double getBasePrice() {
        return 10;
    }

    @Override
    public double getBaseWeight() {
        return 5;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if(distance <= this.getBaseDistance()){
            return distance*this.getBasePrice();
        }
        else if(distance > this.getBaseDistance() && distance <= 500){
            double distanceRemaining = distance-this.getBaseDistance();
            double price = (this.getBasePrice()*this.getBaseDistance()) + (distanceRemaining*20);
            return price;
        }
        else if(distance > 500 && distance <= 1000){
            double distanceRemaining = distance-(this.getBaseDistance()+200);
            double price = (this.getBasePrice()*this.getBaseDistance()) + (200*20) +(distanceRemaining*40);
            return price;
        }
        else{
            double distanceRemaining = distance-(this.getBaseDistance()+200+500);
            double price = (this.getBasePrice()*this.getBaseDistance()) + (200*20) + (500*40)+ (distanceRemaining*50);
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
            double price = (this.getBasePrice()*this.getBaseDistance()) + (distanceRemaining*50);
            return price;
        }
        else if(weight > 10 && weight <= 20){
            double distanceRemaining = weight-(this.getBaseDistance()+5);
            double price = (this.getBasePrice()*this.getBaseDistance()) + (5*50) +(distanceRemaining*60);
            return price;
        }
        else{
            double distanceRemaining = weight-(this.getBaseDistance()+5+10);
            double price = (this.getBasePrice()*this.getBaseDistance()) + (5*50) + (10*60)+ (distanceRemaining*70);
            return price;
        }
    }
}
