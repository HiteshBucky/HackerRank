import java.util.*;

class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		sc.nextLine();
		String str2 = sc.next();

		int s1[] = new int[26];

		for(int i = 0; i<str1.length(); i++)
			s1[str1.charAt(i)-97]++;
		for(int i = 0; i<str2.length(); i++)
			s1[str2.charAt(i)-97]--;

		int ans = 0;
		for(int i = 0; i<26; i++)
			ans += Math.abs(s1[i]);

		System.out.println(ans);	
	}
}

