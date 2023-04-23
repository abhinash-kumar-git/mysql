package DATASTRUCTUREFILE.COM.BasicMath;

public class DemistorAndMinister {
	public static int gcd(int a,int b) {
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	public static void dem(int n,int a[],int d[]) {
		int new_num=1,new_dem=1;
		for(int i=0;i<n;i++) {
			new_num*= a[i];
		    new_dem*= d[i];
		}
		int c=gcd(new_num,new_dem);
		new_num/=c;
		new_dem/=c;
		System.out.println(new_num+"   "+new_dem);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 3;
	        int num[] = { 1, 2, 5 };
	        int den[] = { 2, 1, 6 };
	        dem(n,num,den);

	}

}
