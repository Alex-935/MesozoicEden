import java.util.Scanner;

public class _7_mesozoicEdenAssistant {
    
    public static void main(String[] args) {
        
        int choice = choiceSelection();
        switch (choice) {
            case 1:
                System.out.println(choice);
                break;
            case 2:
                System.out.println(choice);
                break;
            case 3:
                openingTimes();
                break;
            case 4:
                greetGuests();
                break;
            case 5:
                customerCount();
                break;
            case 6:
                System.out.println(choice);
                break;
            default:
                break; 
        }
    }

    static int choiceSelection() {

        Scanner scanner = new Scanner(System.in);
        do { 
            
            System.out.print("""
                    Please select which option you would like:
                    1. Add Dinosaur
                    2. Remove Dinosaur
                    3. Check Opening Times
                    4. Greet Guests
                    5. Customer Count
                    6. Manage Staff Details
                    7. Exit
                    Enter selection:
                    """);
            String option = scanner.nextLine();

            if (option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4") || option.equals("5") || option.equals("6") || option.equals("7")) {
                return Integer.parseInt(option);
            }

        } while (true);

    }

    static void openingTimes() {
        System.out.println("The opening time is 8:00.\nThe closing time is 20:00.");
    }

    static void greetGuests() {
        System.out.println("""
                _______________________________________________________
                Welcome to Mesozoic Eden!\nMesozoic Park is safe and secure.
                ___________________________
                |The park opens at 8:00.  |
                |The park closes at 20:00.|
                ---------------------------
                _______________________________________________________
                """);
    }

    static void customerCount() {
        int customers = 23_430;
        int maxCount = 30_000;
        System.out.printf("The current number of customers is: %d.\n", customers);
        
        if (maxCount < customers) {
            System.out.println("The park is overcrowded by " + (customers - maxCount) + " people!");
        } else {
            System.out.println("The park is not at capacity.\nThere is still capacity for " + (maxCount - customers) + " people.");
        }
    }
}
