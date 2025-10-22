package com.rumesh;

public class Jprogram {

	public static void main(String[] args) {
		
		String s1 = "Java program";
		String s2 = "Selenium Automation";
		StringBuilder result = new StringBuilder();
				
		 String[] words1 = s1.split(" ");
	        String[] words2 = s2.split(" ");

	        // Find the longest array length
	        int maxLength = Math.max(words1.length, words2.length);

	        // Merge word by word
	        for (int i = 0; i < maxLength; i++) {
	            if (i < words1.length)
	                result.append(words1[i]).append(" ");
	            if (i < words2.length)
	                result.append(words2[i]).append(" ");
	        }

	        System.out.println(result.toString().trim());
	    }
}

	


