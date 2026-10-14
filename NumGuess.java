import java.util.Scanner;
import java.util.Random;

void main() {
    Scanner sc = new Scanner(System.in);
    Random rn = new Random();
    int n = 0;
    int Target = rn.nextInt(1, 1000);
    System.out.println("Guess the number between 1 and 999");

    while (n != Target) {
        n = sc.nextInt();
        if (n > Target) {
            System.out.println("Too high");
        } else if (n < Target) {
            System.out.println("Too low");
        } else if (n == Target) {
            System.out.println("You guessed it right ");
        }

    }
}