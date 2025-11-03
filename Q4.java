class logic
{
    int i,max=0;
    void findLargestDigit(int n)
    {
        while (n > 0) 
        {
            digits = n % 10;
            if(max>digits)
                max=digits;
            temp /= 10;
        }
    }
    System.out.println(macx+" is Largest digit in number")
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.findLargestDigit(83429);
    }
}