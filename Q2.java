class logic
{
    void dispalyGrade(int marks)
    {
        if(marks>80)
            System.out.println("A");
        else if(marks>60)
            System.out.println("B");
        else if(marks>40)
            System.out.println("C");
        else
            System.out.println("Fail");
    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.dispalyGrade(82);
    }
}