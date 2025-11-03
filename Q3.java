class logic
{
    int i,iSum=0;
    void checkPerfect(int num)
    {
        for(i=1;i<num;i++)
        {
            if(num%i==0)
                sum=sum+i;
        }
    }
    if(sum==num)
        System.out.println(num+" is a perfect number");
    else 
        System.out.println(num+" is not a perfect number");
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.checkPerfect(6);
    }
}