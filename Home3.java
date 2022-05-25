package homework3;

import java.util.Arrays;

public class Home3 {
    public static void main(String[] args) {
        int[] array = {3, 22, 1, 13, 4, 6, 16, 5};
        // инициализировали и отсортиоравли массив
        Arrays.sort(array);
//выводит (через пробел) те элементы массива, которые являются чётными числами
      /*  for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        System.out.println();*/


        for (int number : array) {
            if (number % 2 == 0)
                System.out.print(number + " ");
        }
        System.out.print("\n");

        //выводит все двузначные числа массива

       /* for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > 9 && array[i] < 100)
                System.out.print(array[i] + " ");
        }
        System.out.println();*/

        for (int number : array)
            if (number > 9 && number < 100)
                System.out.print(number + " ");
        System.out.print("\n");

        //выводит на экран наибольшее целое число этого массива

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

       /* int max = array[0];
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);*/


        //считает сумму элементов массива и выводит её на экран
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

        //переворачивает массив в обратном порядке
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }




    }

}






