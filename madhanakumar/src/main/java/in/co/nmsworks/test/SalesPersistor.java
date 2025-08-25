package in.co.nmsworks.test;

public class SalesPersistor {
    private String sales_id;
    private String product_name;
    private String category;
    private double items_sold;
    private String sale_date;
    private double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
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

    public double getItems_sold() {
        return items_sold;
    }

    public void setItems_sold(double items_sold) {
        this.items_sold = items_sold;
    }

    public String getSale_date() {
        return sale_date;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }

    public SalesPersistor(String sales_id, String product_name, String category, double price, double items_sold, String sale_date) {
        this.sales_id = sales_id;
        this.product_name = product_name;
        this.category = category;
        this.price = price;
        this.items_sold = items_sold;
        this.sale_date = sale_date;
    }

}
