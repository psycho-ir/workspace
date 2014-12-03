package nsn.three;

/**
 * Created by soroosh on 12/2/14.
 */
public class Solution {
    public int solution(int A, int B, int C) {
        int result = 1;
        while (B > 0) {
            if ((B % 2) == 1) {
                result = (result * A) % C;
            }
            A = (A * A) % C;
            B = (int) Math.floor(B / 2);
        }
        return result;
    }

    public static void main(String... args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3, 4, 8));
    }
}
