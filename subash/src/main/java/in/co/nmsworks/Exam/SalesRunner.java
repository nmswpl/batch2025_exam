package in.co.nmsworks.Exam;

public class SalesRunner
{

    public static void main(String[] args) {

        SalesRunner sr = new SalesRunner();
        SalesToDBWriter std  =new SalesToDBWriter();
        std.findAvgForEachCategory();

    }

}
