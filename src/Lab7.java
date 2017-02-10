import java.util.Scanner;

/**
 * Created by williamdonaldson on 2/8/17.
 */
public class Lab7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to our Java class. ");

        System.out.println("Which student would you like to learn more about? ");
        int number = scan.nextInt();
        String answer = "";

        String[] names = {"Richard", "Sandford", "Octavia", "Leornard", "Jacob", "Curtis", "Rebecca", "Carl", "Lynette",
                "Ashley", "Jimmy", "Ciara", "Bernard", "Tracey", "Steven", "Thomas", "Naomi", "Courtney", "Dominique",
                "Ronald"};

        String[] hometown = {"Detroit", "Farmington", "Ann Arbor", "Los Angelas", "Chicago", "Boston", "San Francisco",
                "Orlando", "Atlanta", "Jackson", "Memphis", "Dallas", "Toronto", "Maryland", "Sacramento", "Houston",
                "Miami", "Tampa", "Troy", "San Diego"};

        String[] food = {"Taco", "Fries", "Chili", "Pizza", "Hamburger", "Sausage", "Hot Dog", "Spaghetti", "Dressing",
                "Macaroni Cheese", "Ribs", "Rice", "Lamb Chops", "Alfredo", "Eggs", "Waffles", "Pancakes", "Meatloaf",
                "Noodles", "Greens"};

        while (number > 20) {
            System.out.println("That student does not exist. Please try again. ");
            number = scan.nextInt();
        }
        System.out.println("Student is " + names[number - 1] + ". " + "What would you like to know about " +
                names[number - 1] + "?");


        do {

            try {
                String city = scan.next();
            } catch (IllegalArgumentException e) {
                System.out.println("That data does not exist. ");
                System.out.println(e.getMessage());
            }
            System.out.println(names[number - 1] + " is from " + hometown[number - 1] + "." + " Would you like to know more? ");
            //System.out.println();
            answer = scan.next();

        } while (answer.equals("yes"));
        scan.close();
        System.out.println("Thanks! ");

    }

    public static int getName() throws IllegalArgumentException {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Please enter a positive number: ");
        int n = scan.nextInt();
        if (n < 20) {
            throw new IllegalArgumentException("Please try again. ");
        }

        return n;
    }

}
