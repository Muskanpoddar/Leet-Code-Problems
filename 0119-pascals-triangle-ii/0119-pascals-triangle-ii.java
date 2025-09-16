class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long C =1 ;
        row.add((int)C);
        for(int i = 1 ; i <= rowIndex; i++){
            C = C * (rowIndex - i + 1)/ i;
            row.add((int )C);

        }
        return row;
    }
    public static void main(String[] args){
        List<Integer> result = getRow(3);
        System.out.println(result);
    }
}