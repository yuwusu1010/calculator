package day01;

public class identidyNumber {
    public static void main(String[] args) {
        int a=23;
        int b=32;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);

        int c=12
                ,d=11
                ,e=32
                ;

        boolean cIsmedium=(c>b&&c<e)||(c<b&&b<e);

        System.out.println("cIsmedium = " + cIsmedium);
    }

}
