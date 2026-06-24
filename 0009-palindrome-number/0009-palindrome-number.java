class Solution {
    public boolean isPalindrome(int a) {
        int rev=0;
        int temp=a;

        while(a>0){
            int num = a%10;
            rev = rev * 10 + num;
            a /= 10;
        }
        if(rev==temp){
            return true;
        }
        else{
            return false;
        }
        
    }
}