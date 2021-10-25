public class LessonTwo {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";

        /* Тестируем метод из первого задания: увеличиваем первую переменную на пять в каждом шаге цикла,
        затем передаем ее методу.
         */
        System.out.println(ANSI_RED + "##########################");
        System.out.println("# Проверяем первый метод #");
        System.out.println("##########################" + ANSI_RESET);
        for (int a = 0; a < 25; a = a + 5) {
            if (between10and20 (a, 5)) {
                System.out.println("Соответственно, лежит в пределах диапазона.");
            } else {
                System.out.println("Соответственно, лежит за пределами диапазона.");
            }
            System.out.println("");
        }

        //Проверка метода из второго задания
        System.out.println(ANSI_RED + "##########################");
        System.out.println("# Проверяем второй метод #");
        System.out.println("##########################" + ANSI_RESET);
        minusPlus(-100);
        minusPlus(0);
        minusPlus(1234);
        System.out.println("");

        // Проверка метода третьего задания.
        System.out.println(ANSI_RED + "##########################");
        System.out.println("# Проверяем третий метод #");
        System.out.println("##########################" + ANSI_RESET);
        System.out.println("При x = -11 метод вернул " + negativeTrue(-11));
        System.out.println("При x = 0 метод вернул " + negativeTrue(0));
        System.out.println("При x = 777 метод вернул " + negativeTrue(777));
        System.out.println("");

        // Проверка метода четвертого задания.
        System.out.println(ANSI_RED + "#############################");
        System.out.println("# Проверяем четвертый метод #");
        System.out.println("#############################" + ANSI_RESET);
        stringSomeTimes("Повторение - мать учения!", 4);
        System.out.println("");

        // Проверка метода пятого задания.
        System.out.println(ANSI_RED + "#########################");
        System.out.println("# Проверяем пятый метод #");
        System.out.println("#########################" + ANSI_RESET);
        System.out.println("Год 1900 является вискосным: " + isYearLeap(1900));
        System.out.println("Год 2000 является вискосным: " + isYearLeap(2000));
        System.out.println("Год 2004 является вискосным: " + isYearLeap(2004));
        System.out.println("Год 2021 является вискосным: " + isYearLeap(2021));

    }

    /* Метод, проверяющий, что сумма лежит в пределах между 10 и 20 (включительно),
       возвращающий соответственное булево значение.
       (ПЕРВОЕ ЗАДАНИЕ*/
    public static boolean between10and20 (int a, int b) {
        int sum = a + b;
        System.out.printf("Сумма чисел %d и %d равна: %d%n", a, b, sum);
        if (sum >=10 && sum <=20) {
            return true;
        } else {
            return false;
        }
    }

    /* Метод, проверяющий число на положительность.
   (ВТОРОЕ ЗАДАНИЕ)
    */
    public static void minusPlus(int x){
        System.out.printf("Методу передано число %d, ", x);
        if (x >= 0) {
            System.out.println("и оно является положительным.");
        } else {
            System.out.println("и оно является отрицательным.");
        }
    }

    /* Если число орицательное, то метод возвращает true, при положительном false.
    (ТРЕТЬЕ ЗАДАНИЕ)
     */
    public static boolean negativeTrue (int x){
        // Выполенено без применения конструкции if
        return x < 0; // 0 не будет считаться отрицательным числом
    }

    /* Метод принимает два аргумента: строку и число. Печатает переданную строку количество раз,
    равное переданному числу, т.е. второму аргументу.
    (ЧЕТВЕРТОЕ ЗАДАНИЕ)
     */
    public static void stringSomeTimes (String words, int times){
        int repeats;
        for (repeats=1; repeats < times + 1; repeats++){
            System.out.println(repeats + "). " + words);
        }
    }

    /* Метод, определяющий, является ли год високосным. Если да - возвращает true, нет - false.
    (ПЯТОЕ ЗАДАНИЕ)
     */
    public static boolean isYearLeap (int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }
}
