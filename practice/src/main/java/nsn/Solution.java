package nsn;

import java.util.Arrays;

/**
 * Created by soroosh on 12/1/14.
 */
class Solution {
    int solution(int n) {
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        for (p = l-1; p > 0; --p) {
            int i;
            boolean ok = true;
            for (i = l-1; i > p; --i) {
                if (d[i] != d[i - p]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return l-p+1;
            }
        }
        return -1;
    }

    public static void main(String... args) {
        System.out.println(new Solution().solution(0b11));//1
        System.out.println(new Solution().solution(0b1010));//2
        System.out.println(new Solution().solution(0b10101110));//2
//        System.out.println(new Solution().solution(0b1001001110000111100));//8
//        System.out.println(new Solution().solution(0b110011));//1
    }
}

