class Solution {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int result=0;
        for (char c : s.toCharArray()){
            if (set.contains(c)){
                result++;
                set.clear();
            }
            set.add(c);
        }

        return result+1;
    }
}