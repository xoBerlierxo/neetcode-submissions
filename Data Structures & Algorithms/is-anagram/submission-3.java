class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        boolean check = false;
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(str1.length == str2.length){
            for(int i=0; i<str1.length; i++){
                if(str1[i] != str2[i]){
                    check = false;
                    break;
                }
                else{
                    check = true;
                }
            }
        }
        else{
            check = false;
        }
        return check;
    }
}
