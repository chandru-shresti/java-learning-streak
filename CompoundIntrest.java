import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    double principal;
    double amount;
    double rate;
    int years;
    int timesCompounded;



    System.out.println("Enter the principal :");
    principal = sc.nextDouble();

    System.out.println("Enter the rate :");
    rate = sc.nextDouble();

    System.out.println("Enter the number of years :");
    years = sc.nextInt();

    System.out.println("Enter the timescompounded ");
    timesCompounded = sc.nextInt();

    amount = principal * Math.pow(1 + rate / timesCompounded , timesCompounded * years);

    System.out.printf("the amount after %d years is %f \n",years,amount);

}