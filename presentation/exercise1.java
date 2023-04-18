package presentation;

public class exercise1 {
	public static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		int[] charCount = new int[26]; // array to keep count of each character occurrence

		// count the occurrence of each character in s1
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			charCount[c - 'a']++;
		}

		// subtract the occurrence of each character in s2
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			charCount[c - 'a']--;
			if (charCount[c - 'a'] < 0) {
				return false; // s2 contains a character that is not in s1
			}
		}

		return true; // s2 is a permutation of s1
	}
	/*
	Therefore, the total number of operations performed by the method is proportional to n (the length of the strings).
	 Thus, we can represent the running time of the method as c1*n + c2, where c1 and c2 are constants.
	 Specifically, c1 is the number of operations performed per character (excluding the length comparison),
	 and c2 is the number of constant-time operations (excluding the array creation).
	 */
}
