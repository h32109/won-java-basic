import java.util.Scanner;
class WhatName{
    public static void main(String[] args){
        System.out.println("�̸� ����?");
        String name = "";
        // ���� �Է¹޴� ����
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println(String.format("�̸��� %s �Դϴ�.", name));
        System.out.println("�� ���̴�?");
        int age = 0;
        age = scanner.nextInt();
        System.out.print(String.format("���̴� %d �Դϴ�.", age));

    }
}