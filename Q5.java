class logic
{
    int ans;
    void calculatePower(int num1,int num2)
    {
        ans = math.pow(num1,num2)
        System.out.println("Power is "+ans);
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.calculatePower(2,5);
    }
}