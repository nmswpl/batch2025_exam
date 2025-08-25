package in.co.nmsworks.training_exam_2025;

public class SaleInfo
{
    String sales_id , product_name , category ,sale_date;
    float price ;
    int items_sold ;
    static long sum = 0;

    public String getProduct_name() {
        return product_name;
    }

    public String getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public int getItems_sold() {
        return items_sold;
    }

    public SaleInfo(String sales_id, String product_name, String category, String sale_date, float price, int items_sold) {
        this.sales_id = sales_id;
        this.product_name = product_name;
        this.category = category;
        this.sale_date = sale_date;
        this.price = price;
        this.items_sold = items_sold;

    }
}
