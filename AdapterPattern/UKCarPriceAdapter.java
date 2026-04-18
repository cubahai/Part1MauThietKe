package AdapterPattern;

public class UKCarPriceAdapter implements PriceCalculator {
	    
	    // Khai báo field chứa instance của thư viện bên thứ 3
	    private UKCarPriceCalculator ukCalculator;

	    // Constructor nhận vào đối tượng của thư viện
	    public UKCarPriceAdapter(UKCarPriceCalculator ukCalculator) {
	        this.ukCalculator = ukCalculator;
	    }

	    // Override phương thức của interface PriceCalculator
	    @Override
	    public double calculatePrice() {
	        // Gọi hàm getPrice() từ thư viện bên thứ 3
	        double ukPrice = ukCalculator.getPrice();
	        
	        // (Tùy chọn thực tế) Xử lý logic chuyển đổi nếu cần thiết. 
	        // Vì hệ thống UK trả về Bảng Anh (GBP), còn app của bạn dùng USD, 
	        // Adapter thường kiêm luôn việc convert dữ liệu cho tương thích.
	        // Giả sử tỷ giá: 1 GBP = 1.25 USD
	        double priceInUSD = ukPrice * 1.25; 
	        
	        return priceInUSD;
	    }
	}