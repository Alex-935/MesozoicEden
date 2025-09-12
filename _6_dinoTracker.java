
public class _6_dinoTracker {

    public static void main(String[] args) {

        String[] dinoNames = {"Randy", "Felix", "Toby"};
        int[] dinoAges = {12, 6, 30};
        String[] dinoSpecies = {"T-Rex", "Velociraptor", "Brachiosaurus"};
        int[] dinoEnclosures = {12, 4, 7};

        for (int i = 0; i < dinoNames.length; i++) {
            System.out.printf("%s is a %s. His age is %d and can be found at Enclosure: %d.\n", dinoNames[i], dinoSpecies[i], dinoAges[i], dinoEnclosures[i]);
        }

        int total = 0;
        for (int ages : dinoAges) {

            total += ages;
        }
        System.out.println("The average weight of the dinosaurs is: " + total/(float) dinoAges.length);

    }

}