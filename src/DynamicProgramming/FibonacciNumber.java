class Solution {
    public int fib(int n) {
        if(n==0||n==1)return n;
        int t1=0;
        int t2=1;
        for(int i=2;i<=n;i++)
        {
            int sum=t1+t2;
            t1=t2;
            t2=sum;
        }
        return t2;
        
    }
}
