import java.util.Scanner;
public class student {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name : ");
        String name = sc.nextLine();
        System.out.println("enter your branch :");
        String branch = sc.nextLine();
        System.out.println("enter your id :");
        int id = sc.nextInt();

        System.out.println("have You passed your exam  :  (true/false)");
        boolean isStudent = sc.nextBoolean();
        if(isStudent) {

            System.out.println("enter your gpa ");
            double gpa = sc.nextDouble();
            System.out.println(" name : " + name);
            System.out.println("id no :" + id );
            System.out.println("gpa :" + gpa );
            System.out.println("branch:" + branch);
            System.out.println("!!!!  successfully enrolled congratulations !!!!");


        }
        else
        {
          System.out.println("you cant be enrolled soryyyyy !!");
        }

    }
}
