package kata_tdd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {
		@Test 
		public void returnZeroForEmptyStringInput() {
	    	int result = new StringCalculator().add(""); 
	        assertThat(result).isEqualTo(0);
	    }
		@Test 
		public void returnSumForOfStringNumberInput() {
			int result = new StringCalculator().add("1");
			assertThat(result).isEqualTo(1);
		}
		@Test 
		public void returnSumOfTwoStringNumbersInput() {
			int result = new StringCalculator().add("1,2");
			assertThat(result).isEqualTo(3);
		}
		@Test 
		public void returnSumOfOptionalStringNumbersInput() {
			int result = new StringCalculator().add("1,2,3,11");
			assertThat(result).isEqualTo(17);
		}
		@Test 
		public void addNewLinesDelimiterDuringAddition() {
			int result = new StringCalculator().add("1\n2,3\n11");
			assertThat(result).isEqualTo(17);
		}
		@Test 
		public void useTheOptionalDelimiterToSeparateNumbers() {
			int result = new StringCalculator().add(";\n2,3\n11;12");
			assertThat(result).isEqualTo(28);
		}
}

