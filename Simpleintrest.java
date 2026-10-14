import java.util.Scanner;
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of principle");
    double p = sc.nextDouble();
    System.out.println("enter the value of interest ");
    double i = sc.nextDouble();
    System.out.println("enter time in years");
    double y = sc.nextDouble();

    double simple_interest = (p*i*y)/100;

    System.out.println("The simple interest here is \t "+simple_interest);

}