class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for(int i =1 ; i < n ; i++){
            StringBuilder temp = new StringBuilder();
            for(int j =0; j <result.length();) {
                char current_digit = result.charAt(j);
                int count = 0;
                while( j< result.length() && result.charAt(j) ==current_digit){
                    count++;
                    j++;

                }
                temp.append(count).append(current_digit);

            }
            result =temp.toString();

        }
        return result; 
        
    }
}