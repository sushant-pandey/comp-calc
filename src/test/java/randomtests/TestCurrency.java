package randomtests;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Currency;

import org.junit.jupiter.api.Test;

class TestCurrency {

	@Test
	void test() {
		System.out.println(Currency.getAvailableCurrencies());
	}

}
