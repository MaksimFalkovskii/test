package HomeWork4;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {

        Integer[] dataArr = new Integer[10];
        DataContainer<Integer> data = new DataContainer<>(dataArr);

        data.add(3); // добавляем значения в массив
        data.add(9);
        data.add(4);
        data.add(5);
        System.out.println(Arrays.toString(data.getItems()));
        System.out.println(data.get(3)); // значение под указанным интексом
        System.out.println(data.delete(3)); // удаляем значение под указанным интексом
        System.out.println(Arrays.toString(data.getItems()));
        System.out.println(data.delete(Integer.valueOf(9))); // удаляем указанное значение
        System.out.println(Arrays.toString(data.getItems()));
        System.out.println(data.get(3));  // значение под указанным интексом
        System.out.println(data.delete(data.get(3))); // пытаемся его удалить - null = false не удаляется
        System.out.println(Arrays.toString(data.getItems()));
        System.out.println(data.get(1)); // значение под указанным интексом
        System.out.println(data.delete(data.get(1))); // удаляем значение под указанным интексом
        System.out.println(Arrays.toString(data.getItems()));
    }
}
