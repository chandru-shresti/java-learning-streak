import java.util.Scanner;

void main(){
    Scanner scanner = new Scanner(System.in);
    double r;
    System.out.println("Enter the radius of the circle ");
    r = scanner.nextDouble();
    double circumference = Math.PI * 2 * r;
    System.out.println("The circumference of the circle is " + circumference + " " + "cm");
    double area = Math.PI * Math.pow(r,2);
    System.out.println("the area of circle is " + area + " " + " cm square");
    double volume = 4/3 * Math.PI * Math.pow(r,3);
    System.out.println("The volume of the circle is " + volume + " cm cube");
}
