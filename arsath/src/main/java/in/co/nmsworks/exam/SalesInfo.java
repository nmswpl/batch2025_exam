package in.co.nmsworks.exam;

import java.util.List;

public class SalesInfo {
    private String sales_id;
    private String product_name;
    private String category;
    private String price;
    private String items_sold;
    private String sale_date;

    public SalesInfo() {
    }

    public SalesInfo(String sales_id, String product_name, String category, String price, String items_sold, String sale_date) {
        this.sales_id = sales_id;
        this.product_name = product_name;
        this.category = category;
        this.price = price;
        this.items_sold = items_sold;
        this.sale_date = sale_date;
    }

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getItems_sold() {
        return items_sold;
    }

    public void setItems_sold(String items_sold) {
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
        return "SalesInfo{" +
                "sales_id='" + sales_id + '\'' +
                ", product_name='" + product_name + '\'' +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                ", items_sold='" + items_sold + '\'' +
                ", sale_date='" + sale_date + '\'' +
                '}';
    }
}
