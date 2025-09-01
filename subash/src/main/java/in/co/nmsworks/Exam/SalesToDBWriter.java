package in.co.nmsworks.Exam;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesToDBWriter
{
    private String url = "jdbc:mysql://localhost:3306/training";
    private String pass = "nms-training";
    private String host = "nms-training";

    public void readFileTODB(List<SaleInfo> salesList)
    {
        String query = "INSERT INTO sales_data values(?,?,?,?,?,?)";
        try (Connection con = DriverManager.getConnection(url, host, pass);
             PreparedStatement ps = con.prepareStatement(query))
        {
            for (SaleInfo saleInfo : salesList) {
                ps.setString(1,saleInfo.getSales_id());
                ps.setString(2,saleInfo.getProduct_name());
                ps.setString(3,saleInfo.getCategory());
                ps.setDouble(4,saleInfo.getPrice());
                ps.setInt(5,saleInfo.getItems_sold());
                ps.setString(6,saleInfo.getSale_date());
                ps.executeUpdate();
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void findAvgForEachCategory()
    {
        ResultSet rs = null;
        Map<String,Double> mapAvg = new HashMap<>();
        String query = "Select category , avg(price) from sales_data group by category order by 1";
        try (Connection con = DriverManager.getConnection(url, host, pass);
             PreparedStatement ps = con.prepareStatement(query))
        {
            rs=ps.executeQuery();

            while (rs.next())
            {
               String category =  rs.getString(1);
               Double avg = rs.getDouble(2);
               mapAvg.put(category,avg);
            }
            System.out.println("Category    "+" "+"Average Price");
            System.out.println();
            for (Map.Entry<String, Double> entry : mapAvg.entrySet())
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }



}
