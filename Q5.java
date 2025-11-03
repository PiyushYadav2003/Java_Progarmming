class logic
{
    void checkSign(int num1)
    {
        if(num1>0)
            System.out.println("Positive");
        else if(num1==0)
            System.out.pirntln("Zero");
        else
            System.out.println("Negative");
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.printOddNumber(-8);
    }
}