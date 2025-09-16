import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Dinosaur {

    String name;
    int age;
    String species;

    Dinosaur(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
}

class Employees {
    private String name;
    private String jobTitle;
    private int yearsOfExperience;

    Employees(String name, String jobTitle, int yearsOfExperience) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() { return this.name; }
    public String getjobTitle() { return this.jobTitle; }
    public void setJobTitle(String jobTile) { this.jobTitle = jobTitle; }
    public int getYearsOfExperience() { return this.yearsOfExperience; }
}

class App {

    public Dinosaur trex1 = new Dinosaur("Gregory", 32, "T-Rex");
    public Dinosaur velo1 = new Dinosaur("Shiela", 12, "Velociraptor");
    public Dinosaur brac1 = new Dinosaur("Jake", 26, "Brachiosaurus");

    public Employees emp1 = new Employees("John", "IT Support", 12);
    public Employees emp2 = new Employees("Toby", "Dino Feeder", 2);
    public Employees emp3 = new Employees("Peter", "Dino Researcher", 7);
    public Employees emp4 = new Employees("Paul", "Software Engineer", 17);
    public Employees emp5 = new Employees("Alice", "Dino Feeder", 3);

}

class Park {

    String openingTime;
    String closingTime;
    ArrayList<Dinosaur> dinosaurs;
    ArrayList<Employees> employees;

    Park() {
        this.openingTime = "8:00";
        this.closingTime = "20:00";
        this.dinosaurs = new ArrayList<>(Arrays.asList(
            new Dinosaur("Gregory", 32, "T-Rex"),
            new Dinosaur("Shiela", 12, "Velociraptor"),
            new Dinosaur("Jake", 26, "Brachiosaurus")
        ));
        this.employees = new ArrayList<>(Arrays.asList(
            new Employees("John", "IT Support", 12),
            new Employees("Toby", "Dino Feeder", 2),
            new Employees("Peter", "Dino Researcher", 7),
            new Employees("Paul", "Software Engineer", 17),
            new Employees("Alice", "Dino Feeder", 3)
        ));
    }
}

class food {

}

public class _8_parkManager {

    public static void main(String[] args) {

        Park eden = new Park();
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        do { 
            System.out.print("""
                    Welcome to the Mesozoic Eden Park Manager!
                    1. Dinosaur Manager
                    2. Employee Manager
                    3. Manage Tickets
                    4. Check Park Status
                    5. Handle Special Events
                    6. Exit
                    Please enter your choice:
                    """);
            choice  =  scanner.nextLine();
            
            if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5") || choice.equals("6")) {
                break;
            }
        } while (true);


        switch (choice) {
            case "1":
                manageDinosaurs();
                break;
            case "2":
                manageEmployees();
                break;
            case "3":
                manageTickets();
                break;
            case "4":
                parkStatus();
                break;
            case "5":
                specialEvents();
                break;
            case "6":
                break;
            default:
                break;
        }


    }  

    static void manageDinosaurs() {

    }

    static void manageEmployees() {

    }

    static void manageTickets() {
 
    }

    static void parkStatus() {
        
    }

    static void specialEvents() {

    }


}

