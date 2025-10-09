class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 && Integer.MIN_VALUE %n==0);
    }
}