import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double ticketPrice = 15.99;

        System.out.println("Welcome to the Concert Admissions!");
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        if (userAge > 13){
            System.out.println("Congrats! " + userName + " you meet the requirements.");
            System.out.print("How many tickets would you like to purchase? ");
            int ticketsPurchased = scanner.nextInt();
            if (ticketsPurchased >= 3){
                double discountedPrice = (ticketsPurchased * ticketPrice)-(ticketsPurchased * 0.5);
                System.out.printf("%s%.2f\n","Your total is: $", + discountedPrice);
            } else{
                double regularPrice = ticketsPurchased * ticketPrice;
                System.out.printf("%s%.2f\n","Your total is: $", + regularPrice);

            }
            System.out.println("Enjoy the concert!");
        } else{
            System.out.println("Sorry, " + userName + " you do not meet the requirements.");

        }
    }
}