class logic
{
    void findmin(int num1,int num2,int num3)
    {
        if(num1<num2 && num1<num3)
            System.out.println(num1+" is minimum than"+num2+" and "+num3);
        else if(num2<num1 && num2<num3)
            System.out.println(num2+" is minimum than"+num1+" and "+num3);
        else
            System.out.println(num3+" is minimum than"+num2+" and "+num1);
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.findmin(3,7,2);
    }
}