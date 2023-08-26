package JavaGroup12Project1;

public class Program1 {


    public static void main(String[] args) {

        /*Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week
         */

        int[] temp = {28, 26, 23, 30, 27, 29, 25};
        int largest = temp[0];
        int smallest = temp[1];
        for (int i : temp) {
            if (i > largest) {
                largest = i;
            } else if (i < smallest) {
                smallest = i;


            }
        }
        System.out.println(largest);
        System.out.println(smallest);

    }
}
