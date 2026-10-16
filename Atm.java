import java.util.Scanner;

public class Atm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        double balance = 5000;
        while(choice!=4) {
            System.out.print("1.Check balance \n");
            System.out.print("2.Deposit Money \n");
            System.out.print("3.Withdraw Money \n");
            System.out.print("4.Exit \n");
            System.out.print("Enter your choice : \n");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Your balance is " + balance);
            } else if (choice == 2) {
                System.out.println("Enter the amount to be deposited");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.printf("The new balance after depositing %f is %f \n", deposit, balance);
            } else if (choice == 3) {

                System.out.printf("Enter the amount to be Withdrawn \n");
                double withdraw = sc.nextDouble();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.printf("The new balance after withdrawning %f  is %f \n", withdraw, balance);
                } else {
                    System.out.println("insufficient balance 🥲 \n");
                }

            }
               else if(choice<=0  || choice>4) {
                System.out.println(" invalid choice 💢");
            }
        }
        if(choice==4){
            System.out.println("Thank you for visiting ATM");
        }







    }





}