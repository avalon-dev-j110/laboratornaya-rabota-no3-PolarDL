package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>Алгоритм сортировки, являющийся усовершенствованным
 * вариантом сортировки вставками. Идея метода Шелла состоит
 * в сравнении элементов, стоящих не только рядом, но и на
 * определённом расстоянии друг от друга. Иными словами —
 * это сортировка вставками с предварительными «грубыми»
 * проходами. Аналогичный метод усовершенствования
 * пузырьковой сортировки называется сортировка расчёской.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка Шелла</a>
 */
public class ShellSort implements Sort {

    /**
     * {@inheritDoc}
     */
    public void sort(int[] array) {
        
        int inner;
        int outer;
        int temp;

        int d = 1; 

        while (d <= array.length / 3) {
                d = d * 3 + 1;
        }

        while (d > 0) { 
                for (outer = d; outer < array.length; outer++) {
                        temp = array[outer];
                        inner = outer;
                        while (inner > d - 1 && array[inner - d] >= temp) {
                                array[inner] = array[inner - d];
                                inner -= d;
                        }
                        array[inner] = temp;
                }
                d = (d - 1) / 3; 
        }
        /*
         * TODO(Студент): Реализовать метод sort класса ShellSort
         */
    }
}
