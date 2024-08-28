package lotto;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        //숫자입력받아서 리스트에 저장
        //구입 금액은 1,000원 단위로 입력 받으며 1,000원으로 나누어 떨어지지 않는 경우 예외 처리한다.
        List<Integer> lottoNumbers = List.of(1, 2, 3, 4, 5, 6);  // 6개의 숫자를 List로 만듦
        Lotto lotto=new Lotto(lottoNumbers);
        //오름차순으로 정렬하여 입력한 값 출력
        lotto.printNumbers();  // Lotto 객체의 printNumbers() 메서드 호출

    }
}
