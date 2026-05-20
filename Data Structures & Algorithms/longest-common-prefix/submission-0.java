class Solution {
    public String longestCommonPrefix(String[] arr) {
        StringBuilder str = new StringBuilder(arr[0]);
        for(int i=0; i<arr.length; i++){
            if (!arr[i].startsWith(str.toString())) {
                if(str.length() > 0){
                    str.deleteCharAt(str.length() - 1);
                }
                i = 0;
            }
        }
        return str.toString();
    }
}