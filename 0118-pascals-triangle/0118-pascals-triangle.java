class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1 ; j< i; j++){
                List<Integer> prevRow = triangle.get(i-1);
                row.add(prevRow.get(j-1) +prevRow.get(j));

            }
            if(i> 0) row.add(1);
            triangle.add(row);
        }
        return triangle;
        
    }
    public static void main(String[] args){
        int numRows = 5;
        List<List<Integer>> result =  generate(numRows);
        for(List<Integer> row :result){
            System.out.println(row);
        }
    }
}