package DataStrcures;

public class DSA {
	
	 public double fact(int n) {
	if(n==0) {
		return 1;
		
	}
	return n* fact(n-1); 
	}
	 
	 public static void main(String[] args) {
		 DSA ds = new DSA();
		 System.out.println(ds.fact(5));
	}

}