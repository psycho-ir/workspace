package mob.one;

/**
 * Created by soroosh on 12/9/14.
 */
public class Solution {
    public int solution(int N) {
        int result = 1;
        long currentNumber = 1;
        while (currentNumber != N) {
            if (currentNumber == N) {
                return result;
            }
            if (currentNumber * 2 <= N) {
                currentNumber *= 2;

            } else {
                currentNumber++;
            }
            System.out.println(currentNumber);
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(1024));

    }
}
