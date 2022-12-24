package ru.mirea.lab1;

// ЗАДАНИЕ 3
/*
public class task1{
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 4, 5};
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double average = sum / arr.length;
        System.out.print("Сумма элементов массива: ");
        System.out.println(sum);
        System.out.print("Среднее арифметическое массива: ");
        System.out.println(average);
    }
}
*/



// ЗАДАНИЕ 4
/*
import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива:");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] arr = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
             arr[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        int i = 0;
        while(i != size){
            sum += arr[i];
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
            i += 1;
        }
        System.out.println("Сумма элементов = " + sum + ", минимальный элемент = " + min + ", максимальный элемент = " + max);
    }
}
*/

//ЗАДАНИЕ 5
/*
public class task1{
    public static void main(String[] args){

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
*/


//ЗАДАНИЕ 6
/*
public class task1{
    public static void main(String[] args){
        for(float i = 1; i <= 10; i++){
            System.out.println(1/i);
        }
    }
}
*/

//ЗАДАНИЕ 7
/*
import java.util.Scanner;

public class task1{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое положительное целое число");
        int n = input.nextInt();
        System.out.println("Факториал " + n + " равен: " + factorial(n));
    }
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
*/