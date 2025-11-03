class logic
{
    void checkPrime(int num1)
    {
        if(num%2==0)
            System.out.println(num1+" is not a prime");
        else
            System.out.println(num1+" is a prime");
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.checkPrime(13);
    }
}