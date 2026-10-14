import java.util.Scanner;

public class Day4{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;


        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your age");
        age =sc.nextInt();
        System.out.println("are you a student ? (true/false)");
        isStudent=sc.nextBoolean();


        //Group 1
        if(name.isEmpty()){
            System.out.println("you didnt enter your name 😡💢");
        }
        else{
            System.out.println("hi"+name+"😊");
        }

        //Group 2
        if(age>=18 && age<=59){
            System.out.println("you are an adult 👨‍🦰");
        }

        else if(age<18){
            System.out.println("you are a child 👶");
        }

        else if(age>=60){
            System.out.println("YOU are a senior 🧓");
        }
        else{
            System.out.println(" 💢 error 💢");
        }

     //Group 3

        if(isStudent){
            System.out.println("you are a student 🏫");
        }
        else{
            System.out.println("You are not student 🏢");
        }

    }

}
