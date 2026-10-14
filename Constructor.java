import java.util.Scanner;

class day{
    int roll_no;
    day(Scanner sc){
        System.out.print("enter your roll no");
        roll_no = sc.nextInt();
    }
}
void main() {
    Scanner sc = new Scanner(System.in);
    day d = new day(sc);
    System.out.printf("the roll number is %d",d.roll_no);


}
