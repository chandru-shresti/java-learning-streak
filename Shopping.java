import java.util.Scanner;
//shopping cart

public class shopping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String item;
        int quantity;
        double price;

        System.out.print("enter your item :");
        item = sc.nextLine();
        System.out.print("enter the quantity :");
        quantity= sc.nextInt();
        System.out.print("enter your price :");
        price = sc.nextDouble();

        double total = price*quantity;

        System.out.print("you have bought " +item.toUpperCase()+" "+"The total price is "+total);


    }
}
