class logic
{
    int temp = number;
    int[] digits = new int[10]; 
    int count = 0;
    void printDigit(int num)
    {
        while (temp > 0) {
            digits[count] = temp % 10;
            temp /= 10;
            count++;
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.println(digits[i]);
        }

    }
}

class program
{
    public static void main(String args[])
    {
        logic obj = logic();
        obj.printDigit(9876);
    }
}