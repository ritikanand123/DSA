class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(long x){
        
        if(x==0){
            return 0;
        }    
        long rsb = (x&(-x));
        int ans = (int)(Math.log(rsb)/Math.log(2));
        // System.out.println(ans);
        return(ans+1);
            
    }
}
