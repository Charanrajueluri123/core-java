package daily_practice;

import java.util.*;

public class Reverse_String {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int i=0;
		int j=str.length()-1;
		StringBuffer ans=new StringBuffer(str);
		while(i<j) {
			if(checkVowel(str.charAt(i))) {
				if(checkVowel(str.charAt(j))) {
					char c=str.charAt(j);
					ans.setCharAt(j, str.charAt(i));
					ans.setCharAt(i, c);
					i++;
					j--;
				}
				else {
					j--;
				}
			}
			else {
				i++;
			}
		}
		System.out.println("Original String: "+str);
		System.out.println("Modified String: "+ans);
	}
	static boolean checkVowel(char c) {
		if(c=='a' || c=='e' || c=='i' ||
	c=='o' || c=='u' || c=='A' || c=='E' || c=='I' ||
				c=='O' || c=='U') return true;
		return false;
	}
}
