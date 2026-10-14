import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double area;
        double height;
        double weight;
        System.out.println("Enter the height of rectangle \n");
        height = sc.nextDouble();
        System.out.println("Enter the weight of rectangle \n");
        weight = sc.nextDouble();
        System.out.println("Enter the area of rectangle \n");
        area = height*weight;
        System.out.println("The area of rectangle is \n"+area+"cm2");

    }
}
