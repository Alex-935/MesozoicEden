public class _5_dinoMealPlanner {
    
    public static void main() {

        int currentTime;
        for (currentTime = 0; currentTime <= 23; currentTime++) {
            
            switch (currentTime) {
                case 8: case 13: case 18: {
                    System.out.printf("It's " + currentTime + ":00 - Feeding time for the T-Rex with 100kg of food.\n");
                    break;
                }
                case 7: case 14: case 19: {
                    System.out.printf("It's " + currentTime + ":00 - Feeding time for the Brachiosaurus with 250kg of food.\n");
                    break;
                }
                case 6: case 12: case 17: {
                    System.out.printf("It's " + currentTime + ":00 - Feeding time for the Velociraptor with 70kg of food.\n");
                    break;
                }
            };
                
        }
    }
}
