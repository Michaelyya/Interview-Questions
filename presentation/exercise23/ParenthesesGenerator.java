package presentation.exercise23;

import java.util.*;

public class ParenthesesGenerator {

	public static List<String> generateParentheses(int n) {
		List<String> result = new ArrayList<>();
		if (n == 0) {
			result.add("");
		} else {
			for (int i = 0; i < n; i++) {
				for (String left : generateParentheses(i)) {
					for (String right : generateParentheses(n-i-1)) {
						result.add("(" + left + ")" + right);
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 4;
		List<String> parentheses = generateParentheses(n);
		System.out.println(parentheses);
	}
}
