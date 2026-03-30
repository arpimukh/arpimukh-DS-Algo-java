class FindNextPermutation {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i-- ){
            if(arr[i]<arr[i+1]) {
                pivot=i;
                break;
            }
        }
        if(pivot==-1) {// highest permutation, next is the smallest
            reverse(arr,0,n-1); return;
        }
        for(int i=n-1;i>=pivot;i-- ){
            if(arr[i]>arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }
        reverse(arr, pivot+1, n-1);
    }
    void reverse(int [] arr, int a,int b){
        while(a<b){
            swap(arr, a,b);
           a++;b--;
        }
    }
    void swap(int[] arr, int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    
}
