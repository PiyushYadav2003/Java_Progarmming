class logic
{
    int i,Ecnt=0,Ocnt=0;
    void countEvenOddRagne(int n)
    {
       for(i=0;i<n;i++)
       {
            if(n%i==0)
                Ecnt++;
            else
                Ocnt++;   
       }
    }
    System.out.println("Total number of even numbers are "+Ecnt);
    System.out.println("Total number of odd numbers are "+Ocnt);
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.countEvenOddRagne(12);
    }
}