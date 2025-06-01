class Solution {
    public boolean isPalindrome(int x) {
         int number = x;
        int reversed_number = 0;
        while(number>0){
            int digit = number % 10;
            reversed_number = reversed_number * 10 + digit;
            number = number / 10;
        }

        if(x < 0){
            return false;
        }

        if(x == reversed_number){
            return true;
        }
        else {
            return false;
        }
    
    }
}