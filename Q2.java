class logic
{
    int cnt,num2,rev;
    void countDigit(int num)
    {
        num2=num;
        while(iNo>0)
        {
            iDigit=iNo%10;
            rev=rev*10+iDigit;
            iNo=iNo/10;
        }
    }
    if(rev==num2)
        System.out.println(+rev+" is Palindrome");
    else
        System.out.println(+rev+" is not a Palindrome");
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.countDigit(2345);
    }
}