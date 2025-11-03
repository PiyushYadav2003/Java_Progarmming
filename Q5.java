class logic
{
    int i,min=10;
    int digit,temp;
    void findSmallestDigit(int n)
    {
        while (n > 0) 
        {
            digits = n % 10;
            if(min<digits)
                max=digits;
            temp /= 10;
        }
    }
    System.out.println(min+" is Smallest digit in number");
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.findSmallestDigit(83429);
    }
}