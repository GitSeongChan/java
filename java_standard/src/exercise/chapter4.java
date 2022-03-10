package exercise;

public class chapter4 {
    /*
     * 10<x && x<20
     * !(ch == ''||ch==\t)
     * ch =='x'||ch=='X'
     * '0'<=ch &&ch<='9'
     * 'a'<=ch &&ch<='z' || 'A'<=ch &&ch<='Z'
     * year%400==0 || (year%4 && year%100!=0)
     * powerOn == false 또는 !powerOn
     * str.equals("yes")
     * */
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for (int i = 0; i <= 20; i++) {
            if (!(i%2==0 || i%3==0))
                x +=i;
        }
        System.out.println(x);
    }
}
class ex4_3{
    public static void main(String[] args) {
        int x=0;
        int temp=0;
        for (int i = 1; i <=10 ; i++) {
            x += i;
            temp += x;
        }
        System.out.println(x);
        System.out.println(temp);
    }
}
class ex4_4{
    public static void main(String[] args) {
        int sum =0;
        int s = 1;
        int num =0;

        for (int i = 1; true ; i++,s = -s) {
            num = s * i;
            sum += num;

            if (sum >=100)
                break;
        }
        System.out.println(num);
        System.out.println(sum);
    }
}
class Exercise4_5 {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++) {
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    } // end of main
} // end of class
class ex4_5{
    public static void main(String[] args) {
        int i =0;
        while (i <= 10) {
            int j =0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}


