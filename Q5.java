class logic
{
    void printTable(int num1)
    {
        int i,ans;
        for(i=1;i<num1;i++)
        {
            ans=num1*i;
            System.out.println(ans);
        }
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.printTable(5);
    }
}