public class Main {
    public static void main(String[] args) {
        /*Необходимо реализовать следующий метод:
        1. Получаем на входе массив чисел.
        2. Все четные числа увеличиваем на единицу.
        3. Возвращаем кусок списка с 3-го по 7-й элемент.
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        example(arr);
    }
    public static int[] example(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 1;
            }
            if (i >= 2 && i < 7) {
                    System.out.println(arr[i] + "");
                }
        }
        return arr;
    }
    }
