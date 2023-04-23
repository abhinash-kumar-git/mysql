package DATASTRUCTUREFILE.COM.BasicMath;

public class Demini {
	public static int gcd(int a,int b) {
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	public static void dem(int n,int a[],int d[]) {
		int n1=1,n2=1;
		for(int i=0;i<n;i++) {
			n1*=a[i];
			n2*=d[i];
		}
		int c=gcd(n1,n2);
		n1/=c;
		n2/=c;
		System.out.println(n1+"   "+n2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a[]= {1,2,3,4,7};
		int[]b= {1,3,4,5,6};
		dem(n,a,b);

	}

}
