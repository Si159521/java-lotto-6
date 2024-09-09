package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //n개의 로또번호를 리스트에 저장

        //1. 구입 금액은 1,000원 단위로 입력 받으며 1,000원으로 나누어 떨어지지 않는 경우 예외 처리한다.
        //번호는 쉼표(,)를 기준으로 구분한다.
        //2. 보너스 번호를 입력 받는다.

        //잘못된 값을 입력할 경우
        //"[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
        List<Integer> lottoTickets = new ArrayList<>(); //생성된 로또티켓들을 저장하는 리스트
        Lotto lotto=new Lotto(lottoTickets);

        List<Integer> userEnter = new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        System.out.println("구매금액을 입력해주세요.");
        int price=scanner.nextInt();
        int tickets=price/1000;

        System.out.println("%d개를 구매하였습니다."+tickets);
        for (int i=0;i<tickets;i++) {
            lotto.printNumbers();
        }

        System.out.println("6개의 숫자를 입력하세요.");
        for (int i = 0; i < 6; i++) {
            int number = scanner.nextInt();
            userEnter.add(number);
        }
        System.out.println("보너스번호 1개를 입력하세요.");
        int bonusNum=scanner.nextInt();

        //오름차순으로 정렬하여 입력한 값 출력
//로또객체에서 필요한거 : 로또티켓 생성->application의 list에 생성된 n장의 로또티켓 저장, 예외검사(숫자갯수,
        //1~45 사이의 수인지, 당첨검사, 수익률검사, 최종출력

    }
}
