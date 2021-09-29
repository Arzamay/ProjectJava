package Lesson2;

public class HomeWork_2 {

    public static void main (String[] args) {
        System.out.println("Задание 1" + checkNumbers(2, 7));

        isPositive(-20);

        String result = (IsPositive2(30)) ? "Положительное значение" : "Отрицательное значение";
        System.out.println(result);

        System.out.println("result 3.3 = " + IsPositive2(20));

        methodPrintStringCount("MyString" , 5);

    }

    public static void methodPrintStringCount(String string, int count){
        for (int j=1 ; j<=count ; j++)
            System.out.println(string);
    }

    /*1. Написать метод, принимающий на вход два целых числа и проверяющий, что
    их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
    */
    public static boolean checkNumbers(int a, int b) {
        int sum = a + b;
        return (sum <=20) && (sum >=10);
    }

    /*2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
    */
    public static void isPositive (int c) {
        if (c >= 0) {
            System.out.println(c + "ПОЗИТИВ");
        } else {
            System.out.println(c + "НЕГАТИВ");
        }
    }

    /*3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть вернуть true, если число отрицательное, и вернуть false если положительное
    */
    public static boolean IsPositive2(int variable) {
            return variable <=0; 
    };
    
    public static boolean IsPositive3(int variable) {
            return variable >=0; 
    };

}

