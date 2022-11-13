package lotto.validator;

import static lotto.validator.ErrorMessage.*;

import java.util.regex.Pattern;

public class MoneyInputValidator {
	private static final Pattern pattern = Pattern.compile("[0-9]+");

	public void runMoneyInputValidator(String inputMoney) {
		int money;
		if (isNotConsistOneData(inputMoney)) {
			throw new IllegalArgumentException(ONE_INPUT.getErrorMessage());
		}

		money = Integer.parseInt(inputMoney);
		if (isNotDivided(money)) {
			throw new IllegalArgumentException(NOT_DIVIDED.getErrorMessage());
		}
	}

	private boolean isNotConsistOneData(String money) {
		return !pattern.matcher(money).matches();
	}

	private boolean isNegativeNumber(int money) {
		return money <= 0;
	}

	private boolean isNotDivided(int money) {
		return money % 1000 != 0;
	}
}