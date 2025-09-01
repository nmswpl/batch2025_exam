package in.co.nmsworks;

public class Sales {

    private String sales_id;
    private String product_name;
    private String category;
    private double price;
    private int items_sold;
    private String sale_date;

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

    public int getItems_sold() {
        return items_sold;
    }

    public void setItems_sold(int items_sold) {
        this.items_sold = items_sold;
    }

    public String getSale_date() {
        return sale_date;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "sales_id='" + sales_id + '\'' +
                ", product_name='" + product_name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", items_sold=" + items_sold +
                ", sale_date='" + sale_date + '\'' +
                '}';
    }

    public Sales(String sales_id, String product_name, String category, double price, int items_sold, String sale_date) {
        this.sales_id = sales_id;
        this.product_name = product_name;
        this.category = category;
        this.price = price;
        this.items_sold = items_sold;
        this.sale_date = sale_date;


    }


}