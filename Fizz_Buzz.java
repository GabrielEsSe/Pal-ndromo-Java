public class Fizz_Buzz{
    public static void main(String[] args){
        for (int contador = 1; 100> contador; contador++){
            if (contador % 3 == 0 && contador % 5 == 0){
                System.out.println("fizzbuzz");
                continue;
            }
            if (contador % 3 == 0){
                System.out.println("fizz");
                continue;
            } if (contador % 5 == 0) {
                System.out.println("buzz");
                continue;
            } System.out.println(contador);
        }
    }
}