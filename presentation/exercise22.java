package presentation;

import java.util.ArrayList;
import java.util.List;

import static presentation.exercise22.AnagramGenerator.generateAnagrams;

public class exercise22 {
	public static class AnagramGenerator {
		public static List<String> generateAnagrams(String s) {
			List<String> result = new ArrayList<String>();
			if (s.length() == 1) {
				result.add(s);
			} else {
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					String prefix = s.substring(0, i);
					String suffix = s.substring(i + 1);
					List<String> subAnagrams = generateAnagrams(prefix + suffix);
					for (String subAnagram : subAnagrams) {
						result.add(c + subAnagram);
					}
				}
			}
			return result;
		}
	}

	public static void main(String[] args){
		List<String> a = generateAnagrams("bin");
		for(String b: a){
			System.out.println(b);
		}
	}
}
