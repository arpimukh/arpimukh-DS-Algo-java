public class LCM
{
	public static void main(String[] args) {
	    
		System.out.println("lcm: "+ lcm(6,9));
	}
	public static int lcm(int a, int b){
	    int l= a>b?a:b;
	    int s= a<b?a:b;
	    for(int i=l;i<a*b;i=i+l){
	        if(i%s==0) return i;
	    }
	    return l*s;
	}
}
