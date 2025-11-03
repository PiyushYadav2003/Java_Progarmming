class logic
{
    void reverseNumber(int num)
    {
        while(iNo>0)
        {
            iDigit=iNo%10;
            System.out.println(iDigit);
            iDigit=iNo/10;
        }
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.reverseNumber(2345);
    }
}