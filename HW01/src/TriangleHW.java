
public class TriangleHW {

		// TODO Auto-generated method stub
		private int a; //private
        	private int b; 
		private int c;
	
	public TriangleHW(int a, int b, int  c) {
		this.a=a;  
		this.b=b;
		this.c=c;
		
	
}
	public int geta() {
		return a;
	}
	
	public int getb() {
		return b;
	}
	
	public int getc() {
		return c;
	}
	

	public boolean isEqualiter() {
		if (a == b && b == c && c == a) {
			return true;
		}
		    else {
		    	return false;
		    }
	}
	
		
	public boolean isIsoscles() {
		if(a==b || b==c || a==c ) {
			return true;
		}
		else {
			return false;
		}
		
		}
	
	public boolean isScalene(){
		if(a!=b && b!=c && c!=a) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString(){
		return "(" + this.a + "," + this.b + "," + this.c + ")" + "\n\n";
	}
}

