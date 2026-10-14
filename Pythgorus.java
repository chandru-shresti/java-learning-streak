import java.util.Scanner;
void main() {
    double a;
    double b;
    double c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first side of triangle ");
    a = sc.nextDouble();
    System.out.println("enter second side of triangle ");
    b = sc.nextDouble();
    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    System.out.println("the hypotenus of the triangle is " + c + " " + "cm");
}

