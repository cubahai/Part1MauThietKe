package AdapterPattern;

public class CarPriceCalculator implements PriceCalculator {
    @Override
    public double calculatePrice() {
        return 20000.0; 
    }
}
