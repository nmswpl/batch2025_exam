package in.co.nmsworks.test;

public class SeaShipping implements ShippingMethod{
    @Override
    public double getBaseDistance() {
        return 50;
    }

    @Override
    public double getBaseWeight() {
        return 10;
    }

    @Override
    public double getBasePrice() {
        return 20;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if(distance <= this.getBaseDistance()){
            return distance*this.getBasePrice();
        }
        else if(distance > this.getBaseDistance() && distance <= 100){
            double distanceRemaining = distance-this.getBaseDistance();
            double price = (this.getBasePrice()*this.getBaseDistance()) + (distanceRemaining*10);
            return price;
        }
        else if(distance > 100 && distance <= 500){
            double distanceRemaining = distance-(this.getBaseDistance()+100);
            double price = (this.getBasePrice()*this.getBaseDistance()) + (50*10) +(distanceRemaining*20);
            return price;
        }
        else{
            double distanceRemaining = distance-(this.getBaseDistance()+100+400);
            double price = (this.getBasePrice()*this.getBaseDistance()) + (50*10) + (400*20)+ (distanceRemaining*25);
            return price;
        }
    }

    @Override
    public double additionalWeightCost(double weight) {
        if(weight <= this.getBaseWeight()){
            return weight*this.getBasePrice();
        }
        else if(weight > this.getBaseWeight() && weight <= 25){
            double distanceRemaining = weight-this.getBaseDistance();
            double price = (this.getBasePrice()*this.getBaseDistance()) + (distanceRemaining*30);
            return price;
        }
        else if(weight > 25 && weight <= 50){
            double distanceRemaining = weight-(this.getBaseDistance()+5);
            double price = (this.getBasePrice()*this.getBaseDistance()) + (15*30) +(distanceRemaining*40);
            return price;
        }
        else{
            double distanceRemaining = weight-(this.getBaseDistance()+15+25);
            double price = (this.getBasePrice()*this.getBaseDistance()) + (15*30) + (25*40)+ (distanceRemaining*45);
            return price;
        }
    }
}
