Map<String, Boolean> mp = new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        
       if(s1.length()!=s2.length())
        return false;
 
    if(s1.length()==0 || s1.equals(s2))
        return true;
 
    char[] arr1 = s1.toCharArray();
    char[] arr2 = s2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if(!new String(arr1).equals(new String(arr2))){
        return false;
    }
   if( mp.get(s1+"-"+s2)!=null)return mp.get(s1+"-"+s2);
    for(int i=1; i<s1.length(); i++){
        String s11 = s1.substring(0, i);
        String s12 = s1.substring(i, s1.length());
        String s21 = s2.substring(0, i);
        String s22 = s2.substring(i, s2.length());
        String s23 = s2.substring(0, s2.length()-i);
        String s24 = s2.substring(s2.length()-i, s2.length());
 
        boolean x=((isScramble(s11, s21) && isScramble(s12, s22))||(isScramble(s11, s24) && isScramble(s12, s23)));
        mp.put(s1+"-"+s2,x);
            if(x){
            return x;
            }    
    }    
 
    return false;

    }
