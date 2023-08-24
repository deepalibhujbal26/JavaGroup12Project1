public class Program3 {
    public static void main(String[] args) {

        int [][]numbers={
                {12,3,56,78,4},
                {10,23,8,15,7},
                {21,11,14,6,2}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }

            }
            System.out.println();

    }
}}
