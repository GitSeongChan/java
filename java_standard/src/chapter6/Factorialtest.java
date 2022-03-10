package chapter6;

public class Factorialtest {
    public static void main(String[] args) {
        int result = factorial2(4);

        System.out.println(result);
    }


    static int factorial(int n) {
        int result =0;
        if (n == 1)
            result = 1;
        else
            result = n * factorial(n - 1);
        return result;
    }
    static int factorial2(int n) {
        if(n <= 0 || n > 12) return -1;
        if(n==1) return 1;
        return n * factorial2(n-1);
    }

    static int factorial3(int n) {
        int result = 1;
        while (n != 0)
            result *= n--;
        return result;
    }
}
