package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        //잘못된 값을 입력할 경우
        //"[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
        //중복값을 입력하는경우 - 에러문 출력
        List<List<Integer>> lottoTickets = new ArrayList<>(); //생성된 로또티켓들을 저장하는 리스트
        List<Integer> userEnter = new ArrayList<>();

        System.out.println("구매금액을 입력해주세요.");
        int price = Integer.parseInt(Console.readLine());
        int tickets=price/1000;
        //1000으로 나누어떨어지지 않는경우 예외처리
        if(price%1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 금액은 1,000원 단위로 입력해야 합니다.");
        }

        //로또 발행함수 호출 후 리스트에 집어넣기 -> 티켓개수만큼 반복
        for (int i=0;i<tickets;i++){
            List<Integer> numbers = Lotto.generateLotto();
            Lotto lotto = new Lotto(numbers);
            lottoTickets.add(lotto.getNumbers());
        }

        System.out.println("6개의 숫자를 입력하세요.");
        for (int i = 0; i < 6; i++) {
            int number = Integer.parseInt(Console.readLine());
            if (number<1 || number>45){
                throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
            }
            userEnter.add(number);
            //중복값검사
            //else예약어 사용금지 switch-case도 사용금지
        }
        System.out.println("보너스번호 1개를 입력하세요.");
        int bonusNum=Integer.parseInt(Console.readLine());;
        
        //,를 기준으로 리스트 구성하여 출력(split?)
        System.out.println("%d개를 구매하였습니다."+tickets);
        System.out.println(lottoTickets);

        //당첨결과(else금지 switch-case 금지)
        //번호가 일치할때마다 count하는 형식으로 계산
        //보너스숫자가 유효한 등수는 2등(5개일치+보너스숫자일치)
        //리스트의 0번째 로또티켓부터 순차적으로 count
        //변수 2개필요. 번호일치 count, 당첨티켓 count

//        - 1등: 6개 번호 일치 / 2,000,000,000원
//        - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
//        - 3등: 5개 번호 일치 / 1,500,000원
//        - 4등: 4개 번호 일치 / 50,000원
//        - 5등: 3개 번호 일치 / 5,000원

        int winningTickets=0;
        int[] count=new int[tickets];
        //count를 리스트로 만들어서 저장하기. 첫 번째 로또티켓 : 0개일치 ...
// 까지 해서 수익률낼때 필요. 그리고 맞힌숫자갯수로 당첨여부 감정 필요
        for (int i=0;i<tickets;i++) {
            //userEnter의 모든 숫자와 lottoTickets[x][y]숫자비교
            for (int j = 0; j < 6; j++) {
                if (userEnter.get(i) == lottoTickets.get(i).get(j)) {
                    count[i] += 1;
                }
                if (bonusNum==lottoTickets.get(i).get(j) && count[i]==5)
                    System.out.println("2등");
            }
        }

        //수익률




        //application에서 필요한거 : lotto객체에서 생성된 티켓을 list에 저장, 
        //예외검사(6개숫자중에 중복은 없는지, 1~45사이의 숫자인지),
        //로또리스트출력, 수익률계산 및 출력, 당첨결과계산 및 출력

    }
}
