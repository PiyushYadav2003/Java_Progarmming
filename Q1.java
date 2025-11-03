class logic
{
    int i,iSum=0;
    void SumEvenNumber(int n)
    {
        for(i=1;i<=10;i++)
        {
            if(n%i==0)
                iSum=iSum+i;
        }
    }
    System.out.println("Sum of Even Number is "+iSum);
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.SumEvenNumber(10);
    }
}