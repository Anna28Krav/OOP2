import java.io.Serializable;

// Клас, що представляє дані для обчислень
class CalculationData implements Serializable {
    private static final long serialVersionUID = 1L;
    private double length;
    private double width;
    private double height;

    // Конструктор класу
    public CalculationData(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Методи для обчислення периметру, площі та об'єму
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    // Геттери для отримання параметрів
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Виведення результатів у текстовому вигляді
    public String displayResults(CalculationResultDisplay display) {
        StringBuilder result = new StringBuilder();
        result.append(display.displayPerimeter(calculatePerimeter())).append("\n");
        result.append(display.displayArea(calculateArea())).append("\n");
        result.append(display.displayVolume(calculateVolume())).append("\n");
        return result.toString();
    }
}

// Клас для розрахунку об'єктів кімнати
class Room implements Serializable {
    private static final long serialVersionUID = 1L;
    private double length;
    private double width;
    private transient double height; // Поле height буде transient

    // Конструктор класу
    public Room(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Метод для розрахунку периметру
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Метод для розрахунку площі
    public double calculateArea() {
        return length * width;
    }

    // Метод для розрахунку об'єму
    public double calculateVolume() {
        return length * width * height;
    }

    // Метод для виведення інформації про кімнату
    public String displayInfo(CalculationResultDisplay display) {
        StringBuilder result = new StringBuilder();
        result.append(display.displayPerimeter(calculatePerimeter())).append("\n");
        result.append(display.displayArea(calculateArea())).append("\n");
        result.append(display.displayVolume(calculateVolume())).append("\n");
        return result.toString();
    }
}
