class Solution {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] dp = new int[n + 1];
        dp[n] = 1;
        dp[n - 1] = chars[n - 1] == '0' ? 0 : 1;
        for (int i = n - 2;i >= 0;i--) {
            if (chars[i] == '0') continue;
            dp[i] += dp[i + 1];
            if ((chars[i] - '0') * 10 + (chars[i + 1] - '0') <= 26) dp[i] += dp[i + 2];
        }
        return dp[0];
    }
}