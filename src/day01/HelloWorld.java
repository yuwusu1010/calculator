package day01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);


        System.out.println("type how much minute you want break ");

        int minute = sc.nextInt();

        if(minute>30){
            System.out.println("this time is long for break ");
            int minute1 = sc.nextInt();

        }else  {
        for (int i = minute; i > 0; i--) {
            if (i < 0) {
                break;
            }
            for (int z = 59; z >= 0; z--) {
                System.out.print("\r" + (i - 1) + "minute left " + z + "seconds left ");
                Thread.sleep(1000);
            }

        }}
        System.out.println("\n\n");

        System.err.println("time for hard working ");
    }
}
