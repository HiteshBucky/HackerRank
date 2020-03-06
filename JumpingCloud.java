import java.util.*;

class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i<n; i++)
			a[i] = sc.nextInt();

		int count = 0;
		for(int i = 0; i!=n-1; )
		{
			if( i+2<n && a[i+2] == 0){
				i = i+2;count++;
			}
			else if( i+1<n && a[i+1] == 0){
				i = i+1; count++;
			}
		}
		System.out.println(count);
	}
}	