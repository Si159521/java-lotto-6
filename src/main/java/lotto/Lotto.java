package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Collections;
import java.util.List;
import java.util.Random;
//사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.

public class Lotto {
    private final List<Integer> numbers;

    //생성자
    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] ");
        }
    }

    //로또티켓 생성
    public static List<Integer> generateLotto(){
        //6개의 1~45 정수 랜덤으로 할당하여 리턴
        //중복되지 않아야 함.
        //중복금지처리 아직 안함
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }

    public List<Integer> getNumbers() {
        //오름차순 정렬
        Collections.sort(numbers);
        return numbers;
    }

    //수익률은 소수점 둘째 자리에서 반올림한다. (ex. 100.0%, 51.5%, 1,000,000.0%)
    public void profitability(List<Integer> numbers){

    }

}
