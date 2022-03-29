class Solution {
    public int lengthOfLongestSubstring(String s) {
                Map<Character,Integer> map = new HashMap();
        //char prev = s.charAt(0);
        int j = 0;
        int max = 0;
        int currMax = 0;
        for(int i = 0; i < s.length(); i++){
            //System.out.println(map);
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
                currMax++;
            } else {
                while(j < i && s.charAt(j) != s.charAt(i) ) {
                    currMax--;
                    map.remove(s.charAt(j));
                    j++;
                }
                map.put(s.charAt(i), 1);
                j++;
            }
            max = Math.max(max,currMax);
        }
        return max;
    }
}
