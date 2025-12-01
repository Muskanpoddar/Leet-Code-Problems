public class Solution {
    private boolean isPalindrome(String s , int low ,int high){
        while(low< high ){
            if(s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }
    private void backtrack(int start , List<String> path , List<List<String>> res , String s ){
        if(start == s.length() ){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int end = start + 1 ; end<= s.length(); end++){
            if(isPalindrome(s, start, end -1)){
                path.add(s.substring(start, end));
                backtrack(end, path , res, s);
                path.remove(path.size() -1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(0, new ArrayList<>(), res, s);
        return res;
        
    }
}