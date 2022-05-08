import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = input.nextInt();
        int previousN =0 , presentN = 1, totalN=0;
        for (int i=0 ; i<=n ; i++){
            totalN = previousN + presentN;

            System.out.print(totalN);
            previousN = presentN;
            presentN = totalN;
            System.out.print(" , ");
        }
    }
}
