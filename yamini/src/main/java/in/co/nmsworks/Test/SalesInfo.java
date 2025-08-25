package in.co.nmsworks.Test;

public class SalesInfo implements Comparable<SalesInfo> {
    private String  salesId;
    private  String product_name;
    private String category;
    private  double price;

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SalesInfo(String salesId, String product_name, String category, double price) {
        this.salesId = salesId;
        this.product_name = product_name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SalesInfo{" +
                "salesId='" + salesId + '\'' +
                ", product_name='" + product_name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(SalesInfo o) {
        if(this.category==o.getCategory()){
            return 1;
        }
        return -1;
    }
}
