class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
    for(int i=0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i))){
            if(!st.isEmpty()){
                st.pop();
            }
        }else{
            st.push(s.charAt(i));
        }
    }
    String a="";
    while(!st.isEmpty()){
        a=a+st.pop();
    }
    return new StringBuilder(a).reverse().toString();
    }
}