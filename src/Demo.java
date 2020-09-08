import java.util.Scanner;

public class Demo {

    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);
    }

    public static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int input = scanner.nextInt();

        System.out.println(factorial(input));
//        for(int i = input; i >=0; i--){
//            System.out.println(i + " : " + fib(i));
//        }

        System.out.println("--------------");
    }

}