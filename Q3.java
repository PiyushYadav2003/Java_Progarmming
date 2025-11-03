class logic
{
    void checkDivisible(int num)
    {
        if(num%5==0)
        {
            if(num%7==0)
                System.out.println(num+" is divisible by 5 and 7 both");
            else
                System.out.println(Num+" is Divisible by 5 Only");
        }
        else 
           System.out.println(Num+" is not Divisible by 5 and 7"); 
        
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.checkDivisible(55);
    }
}