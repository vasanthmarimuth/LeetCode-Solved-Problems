class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int row=items.size();
        int count=0;

        for(int i=0;i<row;i++){
            if(ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1))){
                    count++;
            }else if(ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0))){
                    count++;
            }else if(ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))){
                    count++;
                
            }
        }
        return count;
    }
}