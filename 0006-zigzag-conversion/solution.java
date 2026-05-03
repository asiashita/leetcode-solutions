class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
    return s;
}
        StringBuilder []rows= new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();

        }
        int currentRow=0;
        boolean goingDown=false;
        for(char c:s.toCharArray() ){
           rows[currentRow].append(c);

            
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;  // flip direction
            }

            
            currentRow += goingDown ? 1 : -1;
        }

        
        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row); // append each row sequentially
        }

       
        return result.toString();
    }
}
