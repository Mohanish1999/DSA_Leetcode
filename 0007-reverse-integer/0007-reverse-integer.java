class Solution {
    public int reverse(int x) 
    {
    int rev = 0;
    int a = x;
    if(x<0){
      x=x*-1;
    }
    while(x>0){
        if (rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
       {
        return 0;
       }
        int ld = x % 10;
        rev = (rev * 10) + ld;
        x = x/10;
    }
    if(a<0) 
    {
        return (-1*rev);
    }
    return rev;
    }
}