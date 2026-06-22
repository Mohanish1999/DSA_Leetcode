class Solution {
    public void duplicateZeros(int[] arr) {
       int pzd = 0;
       int li = arr.length - 1;
       for(int i = 0; i<=li-pzd; i++){
        if(arr[i]==0){
            if(i==li-pzd){
                arr[li]=0;
                li = li-1;
                break;
            }
            pzd++;
        }
       }
       int nli = li - pzd;
       for(int i = nli; i>=0;i--){
        if(arr[i]==0){
            arr[i+pzd] = 0;
            pzd--;
            arr[i+pzd] = 0;
        }else{
            arr[i+pzd] = arr[i];
        }
       }
    }
}