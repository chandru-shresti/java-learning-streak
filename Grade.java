import java.util.Scanner;

public  class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        char grade;

        System.out.println("Enter your name :");
        name = sc.nextLine();
        System.out.println("Enter your grade ( A B C D E F ):");
        grade = sc.next().charAt(0);

        if(grade == 'A'){
            System.out.println("you got "+ grade + " "+"congratulations!");
        }
        else if(grade == 'B'){
            System.out.println("you got "+ grade + " "+" congratulations!");
        }
        else if(grade == 'C'){
            System.out.println("you got "+ grade + " "+" work hard ");

        }
        else if(grade == 'D'){
            System.out.println("you got "+ grade +" "+ " work hard");
        }
        else if(grade == 'E'){
            System.out.println("you got "+ grade + " "+ " work hard");

        }
        else if(grade == 'F'){
            System.out.println("you got "+ grade + " "+" you failed try again");
        }
        else{
            System.out.println("error\n");
        }

    }
}
