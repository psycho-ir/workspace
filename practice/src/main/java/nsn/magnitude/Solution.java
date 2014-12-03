package nsn.magnitude;

/**
 * Created by soroosh on 12/2/14.
 */
import java.util.BitSet;
public class Solution {

    public  int solution(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        BitSet bits1 = new BitSet(A.length);
        BitSet bits2 = new BitSet(A.length);
        for (int i = 0; i < A.length; ++i) {
            if (A[i] >= max) {
                bits1.set(i);
                max = A[i];
            }
        }
        for (int i = A.length - 1; i >= 0; --i) {
            if (A[i] <= min) {
                bits2.set(i);
                min = A[i];
            }
        }
        bits1.and(bits2);
        return bits1.nextSetBit(0);
    }

    public static void main(String... args){
        System.out.println(new Solution().solution(new int[]{4, 2, 2, 3, 1, 4, 7, 8, 6, 9}));
    }


}
