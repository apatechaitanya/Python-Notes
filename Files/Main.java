// vaild Carminael number
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
	
	public static int gcd(int a, int b) {
		if (a<b) return gcd(b,a);
		else if (a%b==0) return b;
		else return gcd(b,a%b);
	}
	
	public static int modPow (int base, int pow, int mod) {
		return BigInteger.valueOf(base).modPow(BigInteger.valueOf(pow),BigInteger.valueOf(mod)).intValue();
	}
	
	public static boolean isCarmicheal (int n) {
		if (BigInteger.valueOf(n).isProbablePrime(10)) return false;
		
		boolean flag=true;
		for (int i=2;i<n && flag;i++) if (gcd(i,n)==1)flag&=(modPow(i,n-1,n)==1);
		return flag;
	}
	
	public static void main(String[] args)  throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (!(s=br.readLine()).equals("0")) {
			int n=Integer.parseInt(s);
			
			if (isCarmicheal(n)) System.out.println("The number "+n+" is a Carmichael number.");
			else System.out.println(n+" is normal.");
		}
	}
	
}

