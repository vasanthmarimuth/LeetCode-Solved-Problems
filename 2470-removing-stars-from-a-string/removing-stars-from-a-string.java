class Solution {
    public String removeStars(String s) {
        char[] c=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<c.length;i++){
            if(c[i]=='*' && !(st.isEmpty())){
                st.pop();
            }else{
                st.push(c[i]);
            }
        }
        String a="";
        while(!st.isEmpty()){
            a+=st.pop();
        }
        return new StringBuilder(a).reverse().toString();
    }
}