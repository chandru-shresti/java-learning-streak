import java.util.Scanner;
void main(){

    Scanner sc = new Scanner(System.in);
    boolean isStudent ;
    boolean isSenior;
    System.out.println("enter if you are student (true/false)");
    isStudent = sc.nextBoolean();
    System.out.println("enter if you are senior (true/false)");
    isSenior = sc.nextBoolean();
    double price = 999.99;



    if(isStudent){

        if(isSenior) {
            System.out.println("you get 30% discount");
            price *= 0.7;
            System.out.println("The price is "+price);

        }
        else{
            System.out.println("you get 20% discount");
            price*=0.8;
            System.out.println("The price is "+price);
            }

        }
    else{
        if(isSenior) {
            System.out.println("you get 10% discount");
            price *= 0.9;
            System.out.println("The price is " + price);
        }
        else {
            System.out.println("you get no discount");
            System.out.println("The price is "+ price);

        }

    }

    }







