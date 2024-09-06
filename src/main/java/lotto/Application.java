package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //숫자입력받아서 리스트에 저장

        //1. 구입 금액은 1,000원 단위로 입력 받으며 1,000원으로 나누어 떨어지지 않는 경우 예외 처리한다.
        //번호는 쉼표(,)를 기준으로 구분한다.
        //2. 보너스 번호를 입력 받는다.

        //잘못된 값을 입력할 경우
        //"[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
        List<Integer> lottoNumbers = new ArrayList<>();  // 6개의 숫자를 List로 만듦
        Scanner scanner=new Scanner(System.in);

        System.out.println("6개의 숫자를 입력하세요.");
        for (int i = 0; i < 6; i++) {
            int number = scanner.nextInt();
            lottoNumbers.add(number);
        }

        System.out.println("보너스번호 1개를 입력하세요.");
        int bonusNum=scanner.nextInt();

        Lotto lotto=new Lotto(lottoNumbers);
        //오름차순으로 정렬하여 입력한 값 출력
        lotto.printNumbers();  // Lotto 객체의 printNumbers() 메서드 호출

    }
}
