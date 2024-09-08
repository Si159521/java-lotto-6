package lotto;

import java.util.List;
//사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.

//- 로또 번호의 숫자 범위는 1~45까지이다.
//        - 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
//        - 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
//        - 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
//        - 1등: 6개 번호 일치 / 2,000,000,000원
//        - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
//        - 3등: 5개 번호 일치 / 1,500,000원
//        - 4등: 4개 번호 일치 / 50,000원
//        - 5등: 3개 번호 일치 / 5,000원
public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
        //6개의 1~45 정수 랜덤으로 할당
        //,를 기준으로 리스트 구성
        for(int i=0;i<6;i++){
            numbers.get(i) =
        }
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] ");
        }
    }

    //수익률은 소수점 둘째 자리에서 반올림한다. (ex. 100.0%, 51.5%, 1,000,000.0%)
    public void profitability(List<Integer> numbers){

    }

    //6자리 숫자의 로또티켓 생성
    public void printNumbers() {
        System.out.println("[" + numbers + "]");
    }
}
