package patterns;



import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int left = 1;                 // increasing sequence from left
        int right = n * n + n;        // decreasing sequence from right end

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print left block (n - i numbers)
            for (int j = 0; j < n - i; j++) {
                System.out.print(left++ + " ");
            }

            // print right block (n - i numbers)
            for (int j = 0; j < n - i; j++) {
                System.out.print((right - (n - i) + 1 + j) + " ");
            }

            // update right for next row
            right -= (n - i);

            System.out.println();
        }
    }
}
