package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StopWatch watch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bắt đầu!");
        watch.start();
        System.out.println("Kết thúc");
        int a = scanner.nextInt();
        if (a == 1){
            watch.stop();
            System.out.println(watch.getElapseTime());
        }
    }
}
