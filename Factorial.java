import java.util.Scanner;
public static class Factorial {
    int fact(int n) {
        if (n<=1) return 1;
        return n * fact(n-1);
    }
}
void main() {
    Scanner sc = new Scanner(System.in);
    Factorial f = new Factorial();
    System.out.print("Enter the number \n");
    int num = sc.nextInt();
    System.out.println("The factorial of "+ num + " is "+ f.fact(num));
}