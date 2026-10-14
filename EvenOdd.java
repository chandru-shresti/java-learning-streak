import java.util.Scanner;
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number\n");
    int n = sc.nextInt();
    if(n%2==0){
        System.out.printf("The given number %d is even\n",n);
    }
    else{
        System.out.printf("The given number %d is odd\n",n);
    }


}