class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0){
            return false;
        } else{
        long rev = 0;

        int copy = x;

        while(copy > 0){
            int digit = copy%10;
            rev = (rev*10)+digit;
            copy = copy/10;
        }

        if(x == rev){
            return true;
        } else{
            return false;
        }
    }
}
}