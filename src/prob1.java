import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 20: ");
        int n = input.nextInt();

        while(n<1||n>20)
        {

            n = input.nextInt();
        }

        int[] arr = new int[n];
        for(int i = 0; i <arr.length; i++)
        {
            arr[i] = (int) Math.pow(2,i);
            System.out.println(arr[i]);

        }

    }
}
