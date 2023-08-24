import java.util.Scanner;
/* Maximum and minimum number in the array? */

public class Program8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Size of an Array");
            int size = scanner.nextInt();
            System.out.println("Please enter " + size + " number from user to find maximum and minimum number in array");
            int number[] = new int[size];

            for (int row = 0; row < size; row++) {
                number[row] = scanner.nextInt();
            }
            int min = number[0];
            int max = number[1];

            for (int i = 0; i < size; i++) {
                if (number[i] < min) {
                    min = number[i];
                }
                else  if (number[i]>max)
                {
                    max=number[i];
                }
            }

            System.out.println("The Final Output: ");
            System.out.println("The Minimum number in given array " + min);
            System.out.println("The Maximum number in given array " + max);
        }
    }

