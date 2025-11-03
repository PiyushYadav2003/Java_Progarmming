class logic
{
    int cnt;
    void countDigit(int num)
    {
        while(iNo>0)
        {
            iDigit=iNo%10;
            cnt++;
            iDigit=iNo/10;
        }
    }
    System.out.println(cnt);
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.countDigit(2345);
    }
}