package in.co.nmsworks.test;

public class SalesInfo {
    private String sales_id;
    private String product_name;
    private String category;
    private double price;
    private int itemSold;
    private String salesDate;

    public String getSales_id() {
        return sales_id;
    }

    public void setSales_id(String sales_id) {
        this.sales_id = sales_id;
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

    public int getItemSold() {
        return itemSold;
    }

    public void setItemSold(int itemSold) {
        this.itemSold = itemSold;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    public SalesInfo(String sales_id, String product_name, String category, double price, int itemSold, String salesDate) {
        this.sales_id = sales_id;
        this.product_name = product_name;
        this.category = category;
        this.price = price;
        this.itemSold = itemSold;
        this.salesDate = salesDate;
    }

    @Override
    public String toString() {
        return "SaleInfo{" +
                "sales_id=" + sales_id +
                ", product_name='" + product_name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", itemSold=" + itemSold +
                ", salesDate='" + salesDate + '\'' +
                '}';
    }

    public SalesInfo() {
    }



}
