class logic
{
    void printOddNumber(int num1)
    {
        for(int i=1;i<=num1;i++)
        {
            if(num1%i==0)
                System.out.println(num1+" is odd number");
            else
                System.out,.println(num2+" is not a odd numbetr");
        }
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.printOddNumber(20);
    }
}