import java.util.Scanner;
import java.util.Random;
class Dice{
    /**
     * 주사위를 던져서 홀수인지 짝수인지 맞추는 게임입니다.
     * 일단 컴퓨터가 던져서 얻은 값은 3입니다.
     * 사용자는 입력을 홀수 인거 같으면 '홀'을 선택 아니라면 '짝'선택한다고 할 때
     * 결과를 출력하세요.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int dice = 0;
        dice = ran.nextInt(6)+1;
        String answer = "";
        if(dice == 1){
            answer="홀";
        }else if(dice == 2){
            answer="짝";
        }else if(dice == 3){
            answer="홀";
        }else if(dice == 4){
            answer="짝";
        }else if(dice == 5){
            answer="홀";
        }else{
            answer="짝";
        }
        System.out.println("주사위를 돌렸습니다. 선택해주세요.");
        String user = "";
        user = scan.next();
        if(user.equals(answer)){
            System.out.println("정답입니다.");
        }else if(!user.equals(answer)){
            System.out.println("틀렸습니다.");
        }else{
            System.out.println("잘못 선택하셨습니다.");

        }
    }
}