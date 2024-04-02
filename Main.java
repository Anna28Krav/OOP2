public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт CalculationData через фабрику
        CalculationDataFactory factory = new CalculationDataFactoryImpl();
        CalculationData data = factory.createCalculationData(10.0, 5.0, 3.0);

        // Виконуємо обчислення та виводимо результати
        CalculationResultDisplay display = new TextCalculationResultDisplay();
        System.out.println(data.displayResults(display));
    }
}
