package kata_tdd;

import java.util.Arrays;

public class StringCalculator {
	
	public int add(String numbers) {
		if (numbers.isEmpty())
			return 0;
		if (numbers.matches("[0-9]+(((\\n)|(\\,))[0-9]+)*")) { 
			return Arrays.stream(numbers.replaceAll("\n", ",").split(",")).mapToInt(Integer::parseInt).sum();
		}
		else if(numbers.matches("^(.)+((\\n|((.)+))[0-9]+)*")) { 
			String delimiter = numbers.substring(0, numbers.indexOf("\n"));
			return Arrays.stream(numbers.substring(numbers.indexOf("\n") + 1).replaceAll(delimiter, ",").replaceAll("\n",",").split(",")).mapToInt(Integer::parseInt).sum();
		} else {
			return -1;
		}
	}
	public static void main(String[] args) {
//		 String num = ";\n2,3\n11;12"; 
//		 String delimiter = num.substring(0, num.indexOf("\n"));
//		 String[] arr = num.replaceAll(delimiter, ",").replaceAll("\n", ",").split(","); 
//		 for(String r : arr)
//		 System.out.print(r);
	}
}
