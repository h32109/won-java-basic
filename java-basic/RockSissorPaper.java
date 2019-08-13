import java.util.Scanner;
class RockSissorPaper{
    public static void main(String[] args){
        System.out.println("가위바위보 게임");
        System.out.println("1.가위 2.바위 3.보");
        Scanner scan = new Scanner(System.in);
        int rock = 0;
        rock = scan.nextInt();
        if(rock==1){
            System.out.println("당신이 졌습니다.");
        }else if(rock==2){
            System.out.println("비겼습니다.");
        }else if(rock==3){
            System.out.println("당신이 이겼습니다.");
        }else{
            System.out.println("잘못 선택하셨습니다.");
        }
    }
}