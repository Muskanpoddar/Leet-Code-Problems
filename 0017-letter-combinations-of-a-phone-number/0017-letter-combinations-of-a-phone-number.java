class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> combinations = new LinkedList<>();
        if(digits.isEmpty()) return combinations;
        String[] phoneMap  = new String[]{
            "" , "","abc", "def" ,
            "ghi" , "jkl", "mno" , 
            "pqrs" , "tuv" , "wxyz"
        };
        combinations.add("");
        for(int i= 0 ; i< digits.length(); i++){
            int digit = digits.charAt(i) - '0';
            while(combinations.peek().length() == i ){
                String prev = combinations.remove ();
                for(char letter : phoneMap[digit].toCharArray()){
                    combinations.add(prev + letter);

                }
            }
        }
        return combinations;
    }
}