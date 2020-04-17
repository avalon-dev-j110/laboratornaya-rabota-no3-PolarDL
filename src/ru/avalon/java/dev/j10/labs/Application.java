package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Application {

    public static void main(String[] args) {
        int[] array;
        array = new int[20];
        
        FibonacciInitializer fibonacciInitializer = new FibonacciInitializer();
        fibonacciInitializer.initialize(array);
        
        System.out.println("Ряд Фибоначчи для 20:");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        int sumFibonacci = 0;
        
        System.out.println("\n" + "\n" + "Сумма ряда Фибоначчи для 20:");
        
        for (int i = 0; i < array.length; i++) {
            sumFibonacci +=array[i];
        }
        
        System.out.println(sumFibonacci);
        
        
        System.out.println("\n" + "20 случайных чисел от -50 до 50:");
        
        RandomInitializer randomInitializer1 = new RandomInitializer(-50, 50);
        randomInitializer1.initialize(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        
        System.out.println("\n" + "\n" + "Отсортировали пузырьком 20 случайных чисел от -50 до 50:");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        
        System.out.println("\n" + "\n" + "Еще 20 случайных чисел от -50 до 50:");
        
        RandomInitializer randomInitializer2 = new RandomInitializer(-50, 50);
        randomInitializer2.initialize(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        
        System.out.println("\n" + "\n" + "Отсортировали выбором 20 случайных чисел от -50 до 50:");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        
        System.out.println("\n" + "\n" + "Последние 20 Случайных чисел от -50 до 50:");
        
        RandomInitializer randomInitializer3 = new RandomInitializer(-50, 50);
        randomInitializer3.initialize(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        ShellSort shellSort = new ShellSort();
        shellSort.sort(array);
        
        System.out.println("\n" + "\n" + "Отсортировали по Шеллу 20 случайных чисел от -50 до 50:");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println(""); // Чтобы убрать "BUILD SUCCESSFUL (total time: 0 seconds" на следующую строку
        /*
         * TODO(Студент): Выполнить действия над массивом чисел
         *
         * 0. Инициализировать переменную array массивом из 20 целых чисел.
         *
         * 1. Проинициализировать массив значениями
         *    последовательности чисел Фибоначчи.
         *
         * 2. Найти сумму элементов массива.
         *
         * 3. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 4. Отсортировать массив с использованием
         *    пузырьковой сортировки.
         *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
