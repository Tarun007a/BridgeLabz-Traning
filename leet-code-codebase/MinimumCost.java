// leetcode - 3789
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(costBoth <= cost1 && costBoth <= cost2) return (long)costBoth * (long)Math.max(need1, need2);
        
        if(costBoth >= cost1 && costBoth < cost2){
            long result = (long)need2 * (long)costBoth;
            result += (long)Math.max(0, need1-need2) * (long)cost1;
            return result;
        }

        if(costBoth < cost1 && costBoth >= cost2){
            long result = (long)costBoth * need1;
            result += (long)Math.max(0, need2-need1) * (long)cost2;
            return result;
        }
        
        if(costBoth <= cost1 + cost2){
            long result = (long)costBoth * (long)Math.min(need1, need2);
            result += (long)cost1 * (long)(need1 - Math.min(need1, need2));
            result += (long)cost2 * (long)(need2 - Math.min(need1, need2));
            return result;
        }
        
        return (long)need1 * (long)cost1 + (long)need2 * (long)cost2; 
    }
}