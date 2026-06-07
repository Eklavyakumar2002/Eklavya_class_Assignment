package Practiseforbest2;
import java.util.Scanner;
public class primeno_usingwhile {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<2) System.out.println("not prime");
		int cnt=0;
		int i=1;
		while(i<=n) {
			if(n%i==0) {
				cnt++;
			}
			i++;
		}
		if(cnt>2) System.out.println("not prime");
		else	 System.out.println("prime");
		
	}
}
