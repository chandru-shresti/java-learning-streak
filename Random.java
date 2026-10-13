import java.util.Random;
class RRandom {
    public static void main(String[] args) {

        Random rand = new Random();
        int number1 , number2 ;
        number1 = rand.nextInt(1,7) ;
        System.out.println(number1);
        number2 = rand.nextInt(1,7);
        System.out.println(number2);


    }
}
