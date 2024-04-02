public class MarsDay4 {

    private static final String targetLandingLocation = "The Plain";
    private static final double mealConsumptionRate = 0.75;
    private static final int initialShipPopulation = 300;
    private static final double initialMeals = 4000.00;
    private static final String currentLandingLocation = "The Hill";

    public static void main(String[] args) throws InterruptedException {
        String colonyName = "SpaceX";
        double remainingMeals = calculateRemainingMeals(initialMeals, initialShipPopulation);
        System.out.println(remainingMeals);

        remainingMeals = increaseMealsByHalf(remainingMeals);
        int currentShipPopulation = updatePopulation(initialShipPopulation);

        attemptLanding(currentLandingLocation);

        boolean landingSuccess = performLandingCheck(100);
        System.out.println("Landing  success: " + landingSuccess);
    }

    private static double calculateRemainingMeals(double meals, int shipPopulation) {

        double mealsAfterConsumption = meals - 2 * (shipPopulation * mealConsumptionRate);
        return mealsAfterConsumption;
    }

    private static double increaseMealsByHalf(double meals) {
        return meals + (meals * 0.5);
    }

    private static int updatePopulation(int shipPopulation) {
        return shipPopulation + 5;
    }

    private static void attemptLanding(String landingLocation) {
        if (targetLandingLocation.equalsIgnoreCase(landingLocation)) {
            System.out.println("Bbzzz landing on " + targetLandingLocation);
        } else {
            System.out.println("ERROR!!!! Flight plan already set. Landing on " + targetLandingLocation) ;
        }
    }

    private static boolean performLandingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            printLandingStatus(minute);
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false ;
    }

    private static void printLandingStatus(int minute) {
        if (((minute % 3) == 0) && ((minute % 2) == 0)) {
            System.out.println("Keep Center");
        } else if ((minute % 2) == 0) {
            System.out.println("Right");
        } else if ((minute % 3) == 0) {
            System.out.println("Left");
        } else {
            System.out.println("Calculating");
        }

    }
}

