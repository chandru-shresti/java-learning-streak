import java.util.Scanner;

void main(){

    String name;
    int rollno;
    double gpa;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name :");
    name = sc.nextLine();
    System.out.println("Enter your roll number :");
    rollno = sc.nextInt();
    System.out.println("Enter your gpa :");
    gpa = sc.nextDouble();

    System.out.printf("your name is %s , your roll number is %d and your gpa is %.2f ", name, rollno, gpa);


    sc.close();
}

