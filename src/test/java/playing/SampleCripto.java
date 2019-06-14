package playing;

import java.util.Scanner;

public class SampleCripto {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                System.out.println("Enter your name");
                String userName = myObj.nextLine();  // Read user input
                if (userName.contains("Volodya")) {
                    System.out.println("You're bastard");
                }
            }
            else if (i==1){
                System.out.println("Who is your president");
                String userName = myObj.nextLine();  // Read user input
                if (userName.contains("Ze")) {
                    System.out.println("You're Double bastard");
                }
            }
        }
    }

}
