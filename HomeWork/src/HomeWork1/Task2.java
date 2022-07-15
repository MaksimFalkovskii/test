package HomeWork1;

public class Task2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;
        int c = 8;

        int equation1 = result1(a, b, c);
        int equation2 = result2(a, b, c);
        int equation3 = result3(a, b, c);
        int equation4 = result4(a, b, c);
        int equation5 = result5(a, b, c);
        int equation6 = result6(a, b, c);
        // int equation7 = result7(a, b, c);

        print(equation1);
        print(equation2);
        print(equation3);
        print(equation4);
        print(equation5);
        print(equation6);
        // print(equation7);

        //2.8
        boolean equation8 = 6 - 2 > 3 && 12 * 12 <= 119; // true+false
        /*6 - 2 == 4 > 3 true
        12 * 12 == 144 <= 119 false
        для AND true+false = false
         */
        System.out.println(equation8);

        //2.9
        boolean equation9 = true && false;  // для AND true+false = false
        System.out.println(equation9);
    }

    //2.1
    public static int result1(int a, int b, int c) {
        return a + b / c; // 5 + (2 / 8)= 0
        /* result1 = 5, double = 5.25 т.к. int хранит только целое число, дробная часть отсекается,
        деление по приоритету выше
         */
    }

    //2.2
    public static int result2(int a, int b, int c) {
        return (a + b) / c; //  (5 + 2) / 8 = 0
        // result2 = 0,double =0.875 , () используются для явной установки приоритета
    }

    //2.3
    public static int result3(int a, int b, int c) {
        return (a + b++) / c;  // (5 + 2) / 8 = 0
        // result3 = 1; инкримент ++ после переменной сначала участвует в вырожение, а затем наращивется
    }

    //2.4
    public static int result4(int a, int b, int c) {
        return (a + b++) / --c; // (5 + 2) / 7 = 1
        // result4 = 1; инкримент -- перед переменной сначала наращивется, и затем участвует в вырожении
    }
    //2.5

    public static int result5(int a, int b, int c) {
        return (a * b >> b++) / --c;
        // получается 10 в двоичной системе,в десятичной 2/7 = 0;  double =0.28
    }

    //2.6
    public static int result6(int a, int b, int c) {
        int n = 7;
        return (a + n > 20 ? 68 : 22 * b >> b++) / --c;
        //   5+7>20 - false выполняем правую часть 22*2=44>>2 = 11 / 7 = 1  double =1.57
    }

    /*2.7
     private static int result7(int a, int b, int c) {
        return (a + n > 20 ? 68 >= 68 : 22 * 2 >> b++) / --c;
    }  некорректная операция, во второй части должно быть условие с числовым значением
    */
    public static void print(int ag) {
        System.out.println(ag);
    }
}
