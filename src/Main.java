// Main.java
import java.util.*;

/**
 * Головний клас із виконавчим методом.
 * Демонструє створення, сортування та пошук об'єктів класу Blocks.
 */
public class Main {
    /**
     * Головний метод програми.
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        /**
         * Створення масиву будівельних блоків.
         */
        List<Blocks> blocks = new ArrayList<>();

        /**
         * Додавання блоків до масиву.
         */
        blocks.add(new Blocks("Wood", "Brown", 2.5, 3.0, "Plank"));
        blocks.add(new Blocks("Stone", "Gray", 5.0, 6.0, "Brick"));
        blocks.add(new Blocks("Iron", "Silver", 7.8, 10.0, "Ore"));
        blocks.add(new Blocks("Gold", "Yellow", 9.5, 5.0, "Ore"));
        blocks.add(new Blocks("Dirt", "Brown", 1.8, 1.0, "Soil"));

        /**
         * Сортування за вагою (зростання) та твердістю (спадання).
         */
        blocks.sort(Comparator.comparingDouble(Blocks::getWeight) // За вагою за зростанням
                .thenComparing(Comparator.comparingDouble(Blocks::getHardness).reversed())); // За твердістю за спаданням

        /**
         * Виведення відсортованого списку.
         */
        System.out.println("\nВідсортований список блоків:");
        for (Blocks block : blocks) {
            System.out.println(block);
        }

        /**
         * Знаходження блоку, ідентичного заданому.
         */
        Blocks targetBlock = new Blocks("Stone", "Gray", 5.0, 6.0, "Brick");
        int index = blocks.indexOf(targetBlock);

        /**
         * Виведення результату пошуку.
         */
        if (index != -1) {
            System.out.println("\nЗнайдено блок: " + blocks.get(index));
        } else {
            System.out.println("\nБлок не знайдено.");
        }
    }
}
