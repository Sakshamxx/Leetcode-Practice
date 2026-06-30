class Solution {
    public int partitionString(String s) {
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()){
            if (set.contains(ch)){
                result++;
                set.clear();
            }
                set.add(ch);
        }
        return result+1;
    }
}