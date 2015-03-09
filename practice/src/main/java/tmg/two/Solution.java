package tmg.two;

/**
 * Created by soroosh on 12/8/14.
 */
public class Solution {
    public String solution(int V, int R) {
        final String params = "0123456789abcdefghijklmnopqrstuvwxyz";
        String result = "";
        while (V > 0) {
            int mod = V % R;
            result = String.valueOf(params.charAt(mod)) + result;
            V = V / R;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(170, 35));

    }
}
