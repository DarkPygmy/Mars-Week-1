import java.util.Scanner;

public class MarsDay5 {

    private Scanner input;
    private String name;
    private int teamSize;
    private String snack;
    private String vehicleChoice;

    public MarsDay5() {
        this.input = new Scanner(System.in);
        initializeExpedition();
        getNameFromUser();
        getReadiness();
        decideTeamSize();
        chooseSnack();
        selectVehicle();
        finalizeExpedition();
    }

    private void initializeExpedition() {
        System.out.println("Expedition prep program starting...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");
    }

    private void getNameFromUser() {
        System.out.println("Hello user, What is your name?");
        name = input.nextLine();
        System.out.println("Hi, " + name + " --- Welcome to the Expedition prep program.\n" +
                "Are you ready to head out into the new world?\n" +
                "Type Y or N");
    }

    private void getReadiness() {
        String excited = input.nextLine();
        if (excited.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }
    }

    private void decideTeamSize() {
        System.out.println("How many people do you want on your expedition team? (Input an integer number)");
        teamSize = input.nextInt();
        input.nextLine(); // Consume newline left-over
        if (teamSize > 2) {
            System.out.println("That's way too many people. We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamSize = 2;
        } else {
            System.out.println("That's a perfect sized team. Good job.");
        }
    }

    private void chooseSnack() {
        System.out.println("You are allowed to bring one snack with you. What do you bring?");
        snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");
    }

    private void selectVehicle() {
        System.out.println("You have the choice of 3 vehicles:" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");
        vehicleChoice = input.nextLine().toUpperCase();
        switch (vehicleChoice) {
            case "A":
                vehicleChoice = "a Mars Rover";
                break;
            case "B":
                vehicleChoice = "a Chevy Silverado";
                break;
            case "C":
                vehicleChoice = "a Honda Civic";
                break;
            default:
                vehicleChoice = "your feet";
                break;
        }
    }

    private void finalizeExpedition() {
        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");
    }

    public static void main(String[] args) {
        new MarsDay5();
    }
}
