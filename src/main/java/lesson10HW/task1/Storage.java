package lesson10HW.task1;

import java.util.Objects;

public class Storage<E> implements Changeable<E>{
    private E[] array;
    private static final int DEFAULT_ARRAY_SIZE = 10;

    public Storage(int size) {
        this.array = (E[]) new Object[size];
    }

    public Storage() {
        this(DEFAULT_ARRAY_SIZE);
    }

    public E getArray() {
        return (E) array;
    }

    public void add(E value, int index){
        array[index] = value;
    }

    public void print(){
        for (E e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    @Override
    public void exchange(int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
