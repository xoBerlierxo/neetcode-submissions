class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            String sortedS = sort(s);
            if (!res.containsKey(sortedS)) {
                res.put(sortedS, new ArrayList<>());
            }
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }

    static String sort(String stra){
        char tempArray[] = stra.toCharArray();
        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }
    public boolean isAnagram(String stra, String strb){
        stra = sort(stra);
        strb = sort(strb);
        for(int i =0; i<stra.length(); i++){
            if(stra.length() != strb.length()) return false;
        }
        return true;
    } 
}
