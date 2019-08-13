import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        System.out.println("어디 사세요?");
        String place = "";
        Scanner scanner = new Scanner(System.in);
        place = scanner.next();
        System.out.print(String.format("저는 %s에 삽니다.", place));
    }
}