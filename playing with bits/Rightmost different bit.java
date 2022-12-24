class Solution
{
    public static int rsbi(long n){
        
        long rsb = (n&(-n));
        // System.out.println(rsb);
        int ans = (int)(Math.log(rsb)/Math.log(2));
        // System.out.println(ans+1);
        return ans+1;
        
    }
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(long m, long n)
    {
        if(m==n){
            return -1;
        }    
        long dfm = m^n;
        return(rsbi(dfm));
            
    }
}
