package in.co.nmsworks.test;

public class SalesData
{
    private int id;
    private String name;
    private String category;
    private double price;
    private int itemsSold;
    private String saleDate;

    public SalesData()
    {}

    public SalesData(int id, String name, String category, double price, int itemsSold, String saleDate)
    {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.itemsSold = itemsSold;
        this.saleDate = saleDate;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getItemsSold()
    {
        return itemsSold;
    }

    public void setItemsSold(int itemsSold)
    {
        this.itemsSold = itemsSold;
    }

    public String getSaleDate()
    {
        return saleDate;
    }

    public void setSaleDate(String saleDate)
    {
        this.saleDate = saleDate;
    }
}
