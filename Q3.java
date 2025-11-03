class logic
{
    void findmax(int num1,int num2)
    {
        if(num1>num2)
            System.out.println(num1+" is greater then "+Num2);
        else
            System.out.println(num2+" is greater then "+Num1);
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.findmax(20,15);
    }
}