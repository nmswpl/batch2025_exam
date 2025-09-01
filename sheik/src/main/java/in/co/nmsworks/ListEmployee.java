package in.co.nmsworks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListEmployee
{

    public static void main(String[] args) {

        Employee emp1 = new Employee(19,"fayas","MALE");
        Employee emp2 = new Employee(22,"ram" , "MALE");
        Employee emp3 = new Employee(23,"roja","FEMALE");
        Employee emp4 = new Employee(22,"som", "MALE");
        Employee emp5 = new Employee(24,"priya","FEMALE");
        Employee emp6 = new Employee(21,"danu","FEMALE");
        Employee emp7 = new Employee(22,"lal","MALE");
        Employee emp8 = new Employee(21,"dinesh","MALE");
        Employee emp9 = new Employee(22,"anu","FEMALE");
        Employee emp10 = new Employee(21,"ramesh","MALE");

        List<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(emp1);
        listOfEmployees.add(emp2);
        listOfEmployees.add(emp3);
        listOfEmployees.add(emp4);
        listOfEmployees.add(emp5);
        listOfEmployees.add(emp6);
        listOfEmployees.add(emp7);
        listOfEmployees.add(emp8);
        listOfEmployees.add(emp9);
        listOfEmployees.add(emp10);


        analyseEmployees(listOfEmployees);
    }

    public static void countOfMenAndWomen(List<Employee> listOfEmployees) {
        int menCount =0 ;
        int womenCount =0;
        for (Employee employee : listOfEmployees) {
            if(employee.getGender().equals("MALE")){
                menCount++;
            }
            else{
                womenCount++;
            }
        }
        System.out.println("Male count : " + menCount  + " Women Count : " + womenCount);

    }

    public static int averageAgeOfEmployee(List<Employee> listOfEmployees) {
        int sum =0;
        for (Employee employee : listOfEmployees) {
            sum = employee.getAge() + sum ;
        }
        int avg = sum / listOfEmployees.size();
        return avg;
    }

    public static int countEmployee(List<Employee> listOfEmployees) {
        return listOfEmployees.size();
    }

    public static void highestAndLowestAgeAndDifference(List<Employee> listOfEmployee){
        int highestAge =Integer.MIN_VALUE;
        int lowestAge =Integer.MAX_VALUE;
        for (Employee employee : listOfEmployee) {
            if(employee.getAge()>highestAge){
                highestAge = employee.getAge();
            }
            if(employee.getAge()<lowestAge){
                lowestAge = employee.getAge();
            }
        }
        System.out.println("Highest age : " + highestAge + "," +"Lowest age : " +  lowestAge);

        int differenceBwAge = highestAge - lowestAge;
        System.out.println("Difference b/w Highest and Lowest Age : " + differenceBwAge);
    }

    public static void avgOfMale(List<Employee> listOfMaleEmp){
        int sumOfMen =0 ;
        int countOfMen = 0 ;
        for (Employee employee : listOfMaleEmp) {
                sumOfMen = employee.getAge() + sumOfMen;
                countOfMen++;

        }
        System.out.println("Average age of men : " + sumOfMen/countOfMen);
    }

    public static void avgOfFemale(List<Employee> listOfFemaleEmp){
        int sumOfWomen =0;
        int countOfWomen =0;
        for (Employee employee : listOfFemaleEmp) {
                sumOfWomen = employee.getAge() + sumOfWomen;
                countOfWomen++;
        }
        System.out.println("Average age of Women : " + sumOfWomen/countOfWomen);
    }

    public static void analyseEmployees(List<Employee> listOfEmployees){
        //System.out.println(list.size());

        System.out.println("Number of Employees : " +countEmployee(listOfEmployees));
        System.out.println("Average age : " + averageAgeOfEmployee(listOfEmployees));
        countOfMenAndWomen(listOfEmployees);
        highestAndLowestAgeAndDifference(listOfEmployees);


        List<Employee> listOfMaleEmp = new ArrayList<>();
        List<Employee> listOfFemaleEmp = new ArrayList<>();
        for (Employee employee : listOfEmployees) {
            if(employee.getGender().equals("MALE")){
                listOfMaleEmp.add(employee);
            }
            else{
                listOfFemaleEmp.add(employee);
            }
        }
        avgOfMale(listOfMaleEmp);
        avgOfFemale(listOfFemaleEmp);
    }

}
