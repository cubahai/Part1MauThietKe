package AdapterPattern;

public class Main {

	public static void main(String[] args) {
		// Tính giá xe thông thường của app
        PriceCalculator standardCar = new CarPriceCalculator();
        System.out.println("Standard Car Price (USD): " + standardCar.calculatePrice());

        // Khởi tạo hệ thống thư viện của UK (Bên thứ 3)
        UKCarPriceCalculator ukSystem = new UKCarPriceCalculator();

        // Sử dụng Adapter để "bọc" hệ thống UK lại, biến nó thành chuẩn của app
        PriceCalculator ukCarAdapted = new UKCarPriceAdapter(ukSystem);
        
        // Ứng dụng vẫn gọi calculatePrice() như bình thường
        System.out.println("UK Car Price (USD via Adapter): " + ukCarAdapted.calculatePrice());
    }
}
