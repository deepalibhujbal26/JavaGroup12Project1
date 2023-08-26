package Project;

public class Task2 {
    public static void main(String[] args) {

        /*Create an array of integer values. After the array is created,
        calculate the sum of all stored elements in that array.
         */

        int [] nums={1,2,3,4,5,6,7,8,9};
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];

        }
        System.out.println(sum);
        System.out.println("Hello Artur");
    }

}
