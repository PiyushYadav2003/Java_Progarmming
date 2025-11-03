class logic
{
    int i,max=0;
    int iSum=0;
    void ProductofDigit(int n)
    {
        while (n > 0) 
        {
            digits = n % 10;
            iSum = iSum*digits;
            temp /= 10;
        }
    }
    System.out.println("Product of "+n+ " is "+iSum);
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.ProductofDigit(234);
    }
}