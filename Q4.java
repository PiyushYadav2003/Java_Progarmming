class logic
{
    int Ecnt=0,Ocnt=0;
    void printOddNumber(int num1)
    {
        for(int i=1;i<=num1;i++)
        {
            if(num1%i==0)
               Ecnt++; 
            else
               Ocnt++;
        }
    }
    System.out.println("Sum of Even number is "+Ecnt);
    System.out.println("Sum of Odd number is "+Ocnt);
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.printOddNumber(20);
    }
}