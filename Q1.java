class logic
{
    void checkLeap(int year)
    {
        if((year%400==0) or (year%4==0) && (year%100!=0))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.checkLeap(2024);
    }
}