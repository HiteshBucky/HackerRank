import java.util.*;

class Solution{

	public static void check(int []a, int n){
		int ans = 0;
		for(int i = n-1; i>-1; i--)
		{
			if(a[i]-(i+1) > 2){
				System.out.println("Too chaotic");
				return;
			}
			for(int j = Math.max(0,q[i]-2); j<i; j++)
				if(a[j] > a[i]) ans++;
		}
		System.out.println(ans);	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int queries = sc.nextInt();
		for(int query = 0; query<queries; query++)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i<n; i++)
				a[i] = sc.nextInt();

			check(a,n);
		}
		
	}
}	