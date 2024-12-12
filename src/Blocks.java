// Blocks.java
import java.util.Objects;

/**
 * Клас, що представляє будівельний блок з базовими полями.
 * Містить інформацію про матеріал, колір, вагу, твердість та тип блоку.
 */
public class Blocks {
    /** Матеріал блоку, наприклад, дерево, камінь тощо. */
    private String material;

    /** Колір блоку, представлений у вигляді рядка, наприклад, "Brown" або "Gray". */
    private String color;

    /** Вага блоку у кілограмах. */
    private double weight;

    /** Твердість блоку у відносних одиницях. */
    private double hardness;

    /** Тип блоку, наприклад, "Plank", "Brick", "Ore". */
    private String type;

    /**
     * Конструктор класу Blocks для створення об'єкта з усіма параметрами.
     * @param material матеріал блоку
     * @param color колір блоку
     * @param weight вага блоку
     * @param hardness твердість блоку
     * @param type тип блоку
     */
    public Blocks(String material, String color, double weight, double hardness, String type) {
        this.material = material;
        this.color = color;
        this.weight = weight;
        this.hardness = hardness;
        this.type = type;
    }

    // Геттери для доступу до приватних полів

    /**
     * @return матеріал блоку
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @return колір блоку
     */
    public String getColor() {
        return color;
    }

    /**
     * @return вага блоку
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @return твердість блоку
     */
    public double getHardness() {
        return hardness;
    }

    /**
     * @return тип блоку
     */
    public String getType() {
        return type;
    }

    /**
     * Перевизначення методу toString для представлення блоку у вигляді рядка.
     * @return рядок з усіма параметрами блоку
     */
    @Override
    public String toString() {
        return "Blocks{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", hardness=" + hardness +
                ", type='" + type + '\'' +
                '}';
    }

    /**
     * Перевизначення методу equals для перевірки еквівалентності об'єктів.
     * @param obj об'єкт для порівняння
     * @return true, якщо об'єкти однакові, інакше false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Blocks blocks = (Blocks) obj;
        return Double.compare(blocks.weight, weight) == 0 &&
                Double.compare(blocks.hardness, hardness) == 0 &&
                Objects.equals(material, blocks.material) &&
                Objects.equals(color, blocks.color) &&
                Objects.equals(type, blocks.type);
    }

    /**
     * Перевизначення методу hashCode для створення унікального хешу об'єкта.
     * @return унікальний хеш-код об'єкта
     */
    @Override
    public int hashCode() {
        return Objects.hash(material, color, weight, hardness, type);
    }
}