package HomeWork4;

import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    // метод дабовления данных
    public void add(T item) {
        if (item != null) {
            int x = indexAdd(data);
            if (x >= 0) {
                data[x] = item;
            } else {
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length - 1] = item;
            }
        }
    }

    public int indexAdd(T[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public T get(int index) {
        if (index >= data.length || index < 0) {
            return null;
        } else {
            return data[index];
        }
    }

    //возвращает поле data
    public T[] getItems() {
        return data;
    }

    //удаляем элемент по индексу
    public boolean delete(int index) {
        if (index < data.length && data[index] != null) {
            if (data.length - 1 - index >= 0) {
                System.arraycopy(data, index + 1, data, index, data.length - 1 - index);
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        } else {
            return false;
        }
    }

    //Удаляет элемент по значению
    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && data[i].equals(item)) {
                delete(i);
                return true;
            }
        }
        return false;
    }
}
