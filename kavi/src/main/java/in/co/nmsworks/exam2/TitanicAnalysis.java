package in.co.nmsworks.exam2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


class Passenger {
    int id;
    int survived;
    int pclass;
    String name;
    String sex;
    int age;
    int siblingsSpousesAboard;
    int parentsChildrenAboard;
    double fare;

    public Passenger(int id, int survived, int pclass, String name, String sex, int age,
                     int siblingsSpousesAboard, int parentsChildrenAboard, double fare) {
        this.id = id;
        this.survived = survived;
        this.pclass = pclass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.siblingsSpousesAboard = siblingsSpousesAboard;
        this.parentsChildrenAboard = parentsChildrenAboard;
        this.fare = fare;
    }
}

public class TitanicAnalysis {
    public static void main(String[] args) {
        String csvFile = "/home/nms-training/Downloads/titanic.csv";
        String line;
        List<Passenger> passengers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();

            int passengerId = 1;

            while ((line = br.readLine()) != null) {
                String[] fields = new String[8];

                int index = line.indexOf(',');
                fields[0] = line.substring(0, index);
                String remaining = line.substring(index + 1);


                index = remaining.indexOf(',');
                fields[1] = remaining.substring(0, index);
                remaining = remaining.substring(index + 1);


                int sexMaleIndex = remaining.indexOf(",male,");
                int sexFemaleIndex = remaining.indexOf(",female,");

                int sexIndex;
                if (sexMaleIndex != -1 && sexFemaleIndex != -1)
                    sexIndex = Math.min(sexMaleIndex, sexFemaleIndex);
                else if (sexMaleIndex != -1)
                    sexIndex = sexMaleIndex;
                else if (sexFemaleIndex != -1)
                    sexIndex = sexFemaleIndex;
                else
                    sexIndex = -1;

                if (sexIndex == -1) {
                    System.out.println("Error parsing line: " + line);
                    continue;
                }

                fields[2] = remaining.substring(0, sexIndex);
                remaining = remaining.substring(sexIndex + 1);


                index = remaining.indexOf(',');
                fields[3] = remaining.substring(0, index);
                remaining = remaining.substring(index + 1);


                String[] lastFields = remaining.split(",", 4);
                if (lastFields.length < 4) {
                    System.out.println("Error parsing field " + line);
                    continue;
                }

                fields[4] = lastFields[0];
                fields[5] = lastFields[1];
                fields[6] = lastFields[2];
                fields[7] = lastFields[3];

                int survived = Integer.parseInt(fields[0].trim());
                int pclass = Integer.parseInt(fields[1].trim());
                String name = fields[2].trim();
                String sex = fields[3].trim();

                int age;
                try {
                    age = Integer.parseInt(fields[4].trim());
                } catch (NumberFormatException e) {
                    age = -1;
                }

                int siblingsSpousesAboard = Integer.parseInt(fields[5].trim());
                int parentsChildrenAboard = Integer.parseInt(fields[6].trim());
                double fare = Double.parseDouble(fields[7].trim());

                Passenger p = new Passenger(passengerId++, survived, pclass, name, sex, age,
                        siblingsSpousesAboard, parentsChildrenAboard, fare);

                passengers.add(p);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }


        Map<Integer, Integer> totalByClass = new HashMap<>();
        Map<Integer, Integer> survivedByClass = new HashMap<>();

        for (Passenger p : passengers) {
            totalByClass.put(p.pclass, totalByClass.getOrDefault(p.pclass, 0) + 1);
            if (p.survived == 1) {
                survivedByClass.put(p.pclass, survivedByClass.getOrDefault(p.pclass, 0) + 1);
            }
        }

        System.out.println("class-wise Survival Statistics:");
        for (int cls : totalByClass.keySet()) {
            int total = totalByClass.get(cls);
            int survivedCount = survivedByClass.getOrDefault(cls, 0);
            double survivalPercentage = (survivedCount * 100.0) / total;


        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int inputAge = scanner.nextInt();

        System.out.println("Passengers with age less than or equal to " + inputAge + ":");
        for (Passenger p : passengers) {
            if (p.age != -1 && p.age <= inputAge) {
                System.out.println("Passenger ID: " + p.id + ", Name: " + p.name + ", Age: " + p.age);
            }
        }
        scanner.close();
    }
}
