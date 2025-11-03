class logic
{
    int i;
    void divisibleby2and3(int n)
    {
       if(n%2==0)
       {
            if(n%3==0)
            {
                System.out.println(n+" is divisible by 2 and 3 both");
            }
            else
            {
                System.out.println(n+" is divisible by 2 only");
            }
       }
       else if(n%3==0)
                System.out.pirntln(n+" is divisible by 3 only");
       else
            System.out.pirntln(n+" is not divisble by 2 and 3");
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.divisibleby2and3(12);
    }
}