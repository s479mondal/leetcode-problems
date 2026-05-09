class Solution {
        public int myAtoi(String s) {
                s = s.trim();
                        if (s.isEmpty()) return 0;

                                int index = 0;
                                        int sign = 1;
                                                long result = 0;

                                                        // 1. Handle Sign
                                                                if (s.charAt(index) == '-' || s.charAt(index) == '+') {
                                                                            sign = (s.charAt(index) == '-') ? -1 : 1;
                                                                                        index++;
                                                                                                }

                                                                                                        // 2. Convert digits and check for overflow
                                                                                                                while (index < s.length() && Character.isDigit(s.charAt(index))) {
                                                                                                                            int digit = s.charAt(index) - '0';
                                                                                                                                        result = result * 10 + digit;

                                                                                                                                                    // 3. Immediate Overflow Check
                                                                                                                                                                if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                                                                                                                                                                            if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                                                                                                                                                                                        
                                                                                                                                                                                                    index++;
                                                                                                                                                                                                            }

                                                                                                                                                                                                                    return (int) (result * sign);
                                                                                                                                                                                                                        }
}