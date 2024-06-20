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
        StringBuilder a=new StringBuilder();
        while(!st.isEmpty()){
            a.append(st.pop());
        }
        return a.reverse().toString();
    }
}