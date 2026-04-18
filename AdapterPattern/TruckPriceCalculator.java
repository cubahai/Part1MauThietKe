package AdapterPattern;

public class TruckPriceCalculator implements PriceCalculator {
    @Override
    public double calculatePrice() {
        return 50000.0; // Công thức tính ngẫu nhiên, đơn vị USD
    }
}
