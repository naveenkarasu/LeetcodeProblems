class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 ||(x%10==0 &&x>0)){
             return false;
        }
        long r=0;
        for(int temp=x;temp>0;temp/=10)
        {
            r=r*10+temp%10;
        }
        return x==r;
    }
}