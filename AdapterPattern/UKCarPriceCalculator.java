package AdapterPattern;

public class UKCarPriceCalculator {
	public UKCarPriceCalculator() {
        // Constructor của bên thứ 3
    }
	public double getPrice() {
        return 15000.0; // Lấy giá xe từ hệ thống UK (ví dụ: đang ở đơn vị Bảng Anh - GBP)
    }
}
