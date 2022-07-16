public class ExcelSheetColumnNumber {
        //https://leetcode.com/problems/excel-sheet-column-number/
        public int titleToNumber(String columnTitle) {
            int res=0;
            for(int i=0;i<columnTitle.length();i++){
                int x= columnTitle.charAt(i)-64;
                res=res*26+x;
            }
            return res;

        }
}
