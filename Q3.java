class logic
{
    int i;
    void displayFactors(int n)
    {
       for(i=0;i<n;i++)
       {
            if(num%i==0)
                System.out.println(i);
       } 
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.displayFactors(12);
    }
}