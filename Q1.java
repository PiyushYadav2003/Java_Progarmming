class logic
{
    int iSum=0;
    void sumofDigit(int num)
    {
        while(iNo>0)
        {
            iDigit=iNo%10;
            iSum=iSum+iDigit;
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