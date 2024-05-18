//Problem: find longest-substring-with-at-most-k-distinct-characters
public static int kDistinctChars(int k, String str) {
		// Write your code here
		if(str==null||str.length()==0) return 0;
		Map<Character,Integer> count = new HashMap<>();
		char[] chr= str.toCharArray();
		int start=0,max=0;
		for(int i=0;i<str.length();i++){
			count.put(chr[i], count.getOrDefault(chr[i],0)+1);
//while(count.size() >k){
			if(count.size() >k){
				count.put(chr[start],count.getOrDefault(chr[start],0)-1);
				if(count.get(chr[start])<=0){
					count.remove(chr[start]);
				}
				start++;
			}
			max=Math.max(max,i-start+1);
		}
		return max;
	}
