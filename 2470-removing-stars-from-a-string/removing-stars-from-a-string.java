class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(Character c:s.toCharArray()){
            if(c=='*' && !(st.isEmpty())){
                st.pop();
            }else{
                st.push(c);
            }
        }
        String a="";
        while(!st.isEmpty()){
            a+=st.pop();
        }
        return new StringBuilder(a).reverse().toString();
    }
}