import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check :");
        int num = scan.nextInt();
        System.err.println(num%2 == 0? "This is an Even Number": "This is an Odd Number");
    }
}