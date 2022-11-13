package lotto.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lotto.view.OutputView;

public class LotteryMachineTest {
	@DisplayName("로또 랜덤번호 및 정렬 확인")
	@Test
	void getLotteryTickets() {
		//	given
		int money = 8000;
		LotteryMachine lotteryMachine = new LotteryMachine(money);

		//	when
		System.out.println(lotteryMachine.getLotteryTickets());
		//	then
		OutputView.printLotteryTickets(lotteryMachine.getLotteryTickets());
	}
}