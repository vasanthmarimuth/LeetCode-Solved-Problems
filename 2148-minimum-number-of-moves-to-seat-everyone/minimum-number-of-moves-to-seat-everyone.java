class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int ans=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<seats.length;i++){
            ans+=Math.abs(seats[i]-students[i]); 
        }
        return ans;
    } 
}