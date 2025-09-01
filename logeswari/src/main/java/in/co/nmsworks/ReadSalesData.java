package in.co.nmsworks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReadSalesData {

    public ReadSalesData() {
    }


    public List<SalesInformation> readDate(){
//        String sql="INSERT INTO salesDetails Values(?,?,?,?,?,?)";
        String sql="Select * from salesDetails where id=? groupby category;";
        List<Integer> list=new ArrayList<>();

        try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            BufferedReader br= new BufferedReader(new FileReader("/home/nms-training/git/batch2025_exam/logeswari/src/main/resources/SALES_DATA.csv")))
        {
            try(PreparedStatement preparedStatement= con.prepareStatement(sql);
                ResultSet rs= preparedStatement.getResultSet()) {
//                Map<String,Integer> avg=new HashMap<>();
                String line = "";
                while ((br.readLine())!=null){
                    String[] word=line.split(",");
                    line.trim();

                    int id=rs.getInt(1);
                    String name=rs.getString(2);
                    String categroies=rs.getString(3);
                    int price=rs.getInt(4);
                    int itemSold=rs.getInt(5);
                    int Sales=rs.getInt(6);
                    preparedStatement.executeQuery();
                   list.add(readDate().size());
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }        return readDate();
    }

    public void shoReadDate() {


    }
}
