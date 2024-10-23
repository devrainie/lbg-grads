public class Numbers {

    public static void numbersTask(){
        int num1 = 11, num2 = 38;
        int sum = num1 + num2;
        int num3 = 8;
        System.out.printf("%d\n", sum);

        // changed from int to float
        float result = (float) num1 / (float) num2;

        System.out.printf("%d\n", num3++); // 8, the var is incremented after it is returned
        System.out.printf("%d\n", num3); // 9, the var is now incremented
        System.out.printf("%d\n", ++num3); // 10, the var is incremented first then returned
    }
}
