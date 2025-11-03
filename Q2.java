class logic
{
    void checkevenodd(int n)
    {
        if(n%2==0)
            System.out.println(isum+" is even number");
        else
            System.out.println(isum+" is odd number");
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = new logic();
        obj.checkevenodd(7);
    }
}
