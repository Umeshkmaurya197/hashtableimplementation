package com.hashtable;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequencyOfWords {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();

		// Method for split string
		public void stringSplitAndCount() {

			System.out.println("Enter the sentence ");
			String sentence = sc.nextLine();
			String[] tokens = sentence.split(" ");

			// for each loop use
			for (String token : tokens) {
				String word = token.toLowerCase();
				if (map.containsKey(word)) {
					int count = map.get(word);
					map.put(word, count + 1);
				} else {
					map.put(word, 1);
				}
			}
			// display
			for (Entry<String, Integer> en : map.entrySet()) {
				String result = en.getKey() + ":" + en.getValue();
				System.out.println(result);
			}
		}
		public static void main(String[] args) {
			FrequencyOfWords obj = new FrequencyOfWords();
			obj.stringSplitAndCount();
		}
}
