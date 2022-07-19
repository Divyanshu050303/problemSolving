import java.util.Scanner;

public class reverseBits {
    //https://leetcode.com/problems/reverse-bits/
    public int reverseBit(int n) {
        int  result = 0;
        for(int k=0; k<=31; k++) {
            if((n &(1<<k)) !=0) {
                result = result| 1<<(31-k);
            }
        }
        return result;
    }

}
