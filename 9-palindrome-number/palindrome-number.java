class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverse = x ;
        int newX = 0;
        while(x != 0 ){
            int digit = x%10;
               newX= newX *10 + digit;
               x = x/10;


        }

        return newX == reverse;
    }
}