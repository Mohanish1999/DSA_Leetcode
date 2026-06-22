class Solution {
    public boolean isPalindrome(int x) 
    {
           
        int dup = x; 
        if(x < 0 || (x % 10 == 0 && x!=0)){
        return false;
        }
        int rev = 0;
        while(x>rev){
       
        int ld = x % 10;
        rev = (rev * 10) + ld;
        x = x/10;
    }
    return rev==x || rev/10==x;

    }

}