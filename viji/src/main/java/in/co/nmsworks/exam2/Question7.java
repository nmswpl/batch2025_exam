package in.co.nmsworks.exam2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Question7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

      List<Passenger> list =  readDataFromFile("/home/nms-training/Downloads/titanic.csv");
     // System.out.println(list);

      printNameGenderId(list,age);
     // printClassWithSurvivedPeopleCount(list);
      getCategoryWiseClass(list);
    }

    private static void printNameGenderId(List<Passenger> list,int age) {
       for(Passenger p : list){
           if(p.getAge() <= age ){
               System.out.println("The name is : "+ p.getName() + " , The age is :" + p.getAge() + " , The gender is :" + p.getGender());
           }
       }
    }

    private static void getCategoryWiseClass(List<Passenger> list) {
        Map<String ,Integer> map = new LinkedHashMap<>();

       /* for(Passenger l : list){
            if(map.containsKey(l.getPclass())){
                String i = map.get(l.getPclass()) + 1;
                map.put(l.getPclass(),i);
            }
            else{
                map(l.getPclass() ,1);
            }
        }*/




    }

   /* private static void printClassWithSurvivedPeopleCount(List<Passenger> list) {

        for(Passenger l : list){

        }
    }
*/
    private static List<Passenger> readDataFromFile(String filePath) {
        List<Passenger> list = new ArrayList<>();
        try(BufferedReader br  = new BufferedReader(new FileReader(filePath))){
            String line ;
            br.readLine();
            while((line = br.readLine()) != null){
                String[] arr = line.split(" ,");
                Passenger p  = new Passenger(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[2],arr[3],Integer.parseInt(arr[4]),Integer.parseInt(arr[5]),Integer.parseInt(arr[7]),Float.parseFloat(arr[7]));
                list.add(p);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
     return list;
    }
}
