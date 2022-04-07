package lesson13;

public class Store {
    private int product = 0;

    public synchronized void getProduct() {
        if (product < 1){
            System.out.println("The buyer has left the store!");
            try {
                wait();
                System.out.println("The buyer has arrived!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product --;
        System.out.println("The buyer has bought 1 item of product");
        System.out.println("Total product: " + product);
        notify();
    }

    public synchronized void setProduct() {
        if (product > 3){
            System.out.println("The seller is having a rest!");
            try {
                wait();
                System.out.println("The seller is working!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product ++;
        System.out.println("The seller has refilled 1 item of product");
        System.out.println("Total product: " + product);
        notify();
    }
}

class MainStore {
    public static void main(String[] args) {
        Store store = new Store();

        // Продавец
        new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                store.setProduct();
            }
        }).start();

        // Покупатель
        new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                store.getProduct();
            }
        }).start();



    }
}
