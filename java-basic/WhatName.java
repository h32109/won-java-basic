import java.util.Scanner;
class WhatName{
    public static void main(String[] args){
        System.out.println("�̸� ����?");
        String name = "";
        // ���� �Է¹޴� ����
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("�̸��� " + name +"�Դϴ�. ");
        System.out.println("�� ���̴�?");
        int age = 0;
        age = scanner.nextInt();
        System.out.print("���̴� " + age + "�� �Դϴ�. ");

    }
}