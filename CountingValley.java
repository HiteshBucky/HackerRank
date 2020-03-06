import java.util.*;

class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();

		int down = 0,ans = 0;
		for(int i = 0; i<n; i++)
		{
			if(str.charAt(i) == 'D')
				down++;
			else if(str.charAt(i) == 'U' && (down-1) == 0){
				down--; ans++;
			}
			else 
				down--;
		}
		System.out.print("Result " + ans);


	}
}