// Клас для відображення результатів обчислень у текстовому вигляді
class TextCalculationResultDisplay implements CalculationResultDisplay {
    @Override
    public String displayPerimeter(double perimeter) {
        return "Perimeter: " + perimeter;
    }

    @Override
    public String displayArea(double area) {
        return "Area: " + area;
    }

    @Override
    public String displayVolume(double volume) {
        return "Volume: " + volume;
    }
}
