public class Lesson2 {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 6;

        System.out.println("Sum = " + getSum(a,b));
    }

    public static int getSum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
