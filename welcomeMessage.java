



public class welcomeMessage {
    
    public static void main(String[] args) {
        
        System.out.println(welcomeMessage());


    }

    static String welcomeMessage() {
        
        //System.out.println("Welcome to Mesozoic Eden!\nMesozoic Park is safe and secure.");

        /*
        String name =  "Jack";
        String position = "Dinosaur Researcher";

        System.out.printf("My name is %s and in 5 years time I want to be a %s in Mesozoic Eden.\n", name, position);
        */

        return """
                _______________________________________________________
                Welcome to Mesozoic Eden!\nMesozoic Park is safe and secure.
                ___________________________
                |The park opens at 8:00.  |
                |The park closes at 20:00.|
                ---------------------------
                _______________________________________________________
                """;
    }

    static void openingHours() {

        String openingTime = "8:00";
        String closingTime = "20:00";

        System.out.printf("The park opens at %s.\nThe park closes at %s.", openingTime, closingTime);
    }
}
