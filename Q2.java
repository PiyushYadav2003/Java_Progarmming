class logic
{
    int i;
    void printReverse(int n)
    {
        for(i=n;i>0;i--)
            System.out.println(i);
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.printReverse(10);
    }
}