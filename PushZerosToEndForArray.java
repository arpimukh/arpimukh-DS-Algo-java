public class PushZerosToEndForArray
{
	public static void main(String[] args) {
	    int [] arr = {0,0,0,0,3,1,4,0}; // {0,0} //{0,15}
	    
	//	System.out.println("arr: "+ 
		pushZerosToEnd(arr);
	}
 public static void pushZerosToEnd(int[] arr) {
        // code here
        int j=1;
        for(int i=0;i<arr.length-1;i++){
            
            if(arr[i]==0){
                while(j<arr.length-1 && arr[j]==0){j++;}
                if(j<arr.length){
                arr[i]=arr[j];
                arr[j]=0;
                }
               // j++;
               // k++;
            }j++;
        }
        
    }
}
