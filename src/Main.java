import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k, average, sum = 0, count = 0;

        Scanner doa = new Scanner(System.in); //define scanner
        System.out.print("Enter the Number: "); //get value from user
        k = doa.nextInt();

        for (int i = 1; i <= k; i++) { //loop rules determined
            if (i % 12 == 0) { //define divisibility rule

                sum += i;
                count++;

            }
        }
        if (count == 0) { //not being calculated
            System.out.println("Not found to be divided!");
        } else {
            average = sum/count; //successful calculation
            System.out.println("Average: " + average );

        }
    }
}
