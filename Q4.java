class logic
{
    int i,cnt;
    void displayFactors(int n)
    {
       for(i=0;i<n;i++)
       {
            if(num%i==0)
                cnt++;
       } 
    }
    System.out.println("Total number of factors of "+n+" is "+cnt);
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.displayFactors(12);
    }
}