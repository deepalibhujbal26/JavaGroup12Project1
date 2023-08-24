public class Program4 {
    public static void main(String[] args) {

        /*
        Create a 2D array of integers. Develop a program which will calculate
the sum of even and odd numbers for that array.
         */
        int[][] numbers = {{7, 18, 16, 5, 65},
                {10, 13, 17, 32},
                {19, 21, 14, 12}};

        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sumEven += numbers[i][j];

                } else {
                    sumOdd += numbers[i][j];
                }


            }
        }
        System.out.println("Total sum of Even numbers is " + sumEven);
        System.out.println("Total sum of Odd numbers is " + sumOdd);

    }
}
