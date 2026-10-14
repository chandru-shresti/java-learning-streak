//simple calculator
import java.util.Scanner ;
public class day2 {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);


       System.out.println("enter your 1st number");
       int n1= sc.nextInt();
       System.out.println("enter your 2nd number");
       int n2= sc.nextInt();

       System.out.println("enter your choice (1.add / 2.substraction / 3.multiplication / 4.division) ");
       int choice = sc.nextInt();

       if(choice==1) {
           int add = n1+n2;
           System.out.println("the addition of 2 numbers is \n"+add);

        }
       else if(choice==2) {
           int sub = n1-n2;
           System.out.println("the subtraction of 2 numbers is \n"+sub);
       }
       else if(choice==3) {
           int multi = n1*n2;
           System.out.println("the multiplication of 2 numbers is \n"+multi);
       }
       else if(choice==4) {
           int div = n1*n2;
           System.out.println("the division of 2 numbers is \n"+div);
       }
       else {
           System.out.println("!!! EROOR !!!");
       }




    }
}
