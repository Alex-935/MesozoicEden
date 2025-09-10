public class _3_caretaking {
    
    public static void main(String[] args) {
        
        System.out.println(avgWeight(12.2F, 7.3F));
        System.out.println(leapYear(2025));
        System.out.println(leapYear(2012));

        atCapacity(15, 15);

        feedAmount(2000, 3);
    }

    static float avgWeight(float weight1, float weight2) {

        return (weight1 + weight2)/2;
    }

    static void feedAmount(float weight, int numFeeds) {

        System.out.printf("A dinosaur of weight %.2fkg needs to eat %.2fkg of food per day, in portions of %.2fkg servings.\n", weight, weight*0.05f, (weight*0.05f)/numFeeds);
    }

    static boolean leapYear(int year) {
        return year % 4 == 0;
    }

    static void atCapacity(int currentCapacity, int maxCapacity) {
        
        System.out.printf("Maximum capacity reached: %b.\n", currentCapacity >= maxCapacity);
    }

}
