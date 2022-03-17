package lesson10HW.task3;

import lesson3.Main;

public class Box<E>{
    private E[] fruitBox;
    private static final int BOX_CAPACITY = 15;
    private double fruitWeight;
    private int currentSize;

    public Box(int size) {
        this.fruitBox = (E[]) new Object[size];
        currentSize = 0;

    }

    public Box() {
        this(BOX_CAPACITY);
    }

    public void add(E fruit){
        add(fruit, currentSize);
        if (fruit instanceof Apple){
            fruitWeight = 1.0;
        } else if (fruit instanceof Orange){
            fruitWeight = 1.5;
        }
    }

    public void add(E fruit, int index){
        fruitBox[index] = fruit;
        currentSize++;
    }

    public double getWeight(){
        double fruitsNumber = currentSize;
        return fruitsNumber * fruitWeight;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public E[] getFruitBox() {
        return fruitBox;
    }

    public boolean compare(Box<?> o) {
        return Math.abs(o.getWeight() - getWeight()) < 0.0000001;
    }

    public void pour(Box<E> boxOfFruits) {
        for (int i = 0; i < boxOfFruits.getCurrentSize(); i++) {
            add(boxOfFruits.getFruitBox()[i]);
        }
    }
}
