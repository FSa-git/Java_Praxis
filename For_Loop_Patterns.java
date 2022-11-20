import java.util.Scanner;

public class For_Loop_Patterns {

        public static void main(String[] args) {

            int numStars;

            //System.out.println("Hello, how many stars would you like to have?");

            do {
                System.out.println("Hello, how many stars would you like to have?");

                Scanner sc = new Scanner(System.in);
                numStars = sc.nextInt();
                // These are patterns

                for (int i = 1; i <= numStars; i++) { // Row
                    for (int j = 0; j < i; j++) { // Amount of collums
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int i = numStars -1; i > 0; i--) {
                    for (int j = 0; j < i; j++) { // Amount of collums
                        System.out.print("*");
                    }
                    System.out.println();

                }

            }while(numStars != 0);

        }
    }
