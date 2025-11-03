class logic
{
    int i;
    long fact;
    void findfact(int n)
    {
        for(i=0;i<n;i++)
            fact=fact*i;
    }
    System.out.println("factorail of"+n+"is"+fact);
}

class program
{
    public static void main(String args[])
    {
        logic obj = new logic();
        obj.findfact(5);
    }
}
