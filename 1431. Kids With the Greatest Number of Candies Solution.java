class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int high = 0;
        for(int i=0;i<candies.length;i++){
            high = Math.max(high,candies[i]);
        }
        ArrayList<Boolean> a = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=high){
                a.add(true);
            }
            else{
                a.add(false);
            }
        }
        return a;
    }
}
