import java.util.Scanner;
class WhatName{
    public static void main(String[] args){
        System.out.println("이름 뭐니?");
        String name = "";
        // 값을 입력받는 지점
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println(String.format("이름은 %s 입니다.", name));
        System.out.println("몇 살이니?");
        int age = 0;
        age = scanner.nextInt();
        System.out.print(String.format("나이는 %d 입니다.", age));

    }
}