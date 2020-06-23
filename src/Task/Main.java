package Task;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Worker> workers = new LinkedList<Worker>();
        workers.add(new Loader("Грузчик по имени Антон (работает 2/2) получает: ", 20000));
        Loader Loader1 = new Loader("Грузчик по имени Матвей (работает каждый день) получает: ", 25000);
        workers.add(Loader1);
        Seller seller1 = new Seller ("Продавец по имени Мария получает: ", 50000, "Старший продавец");
        workers.add(seller1);
        Seller seller2 = new Seller ("Продавец по имени Карина получает: ", 30000, "Младший продавец");
        workers.add(seller2);
        for (Worker current : workers) {
            System.out.println(current.getName() + " " + current.getPay().toString()+ " рублей");
        }
    }
}

