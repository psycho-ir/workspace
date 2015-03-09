package tmg.three;

/**
 * Created by soroosh on 12/8/14.
 */
public class Solution {

    public int solution(int A, int B) {
        int result = 0;
        for (int startsCube = (int) Math.ceil(Math.cbrt(A)); Math.pow(
                startsCube, 3.0) <= B; startsCube++) {
            result++;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(-2147483648,2147483647));

    }
}
