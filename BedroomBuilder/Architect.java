package Model;

public class Architect {

	public static void main(String[] args) {
		Bedroom myroom = new BedroomBuilder()
				.setwallColor("Xanh dương") // Đặt màu tường
                .setnumberOfWindows(2)      // Đặt 2 cửa sổ
                .sethasAirConditor(true)    // Lắp điều hòa
                .setbedSize("King Size")    // Chọn giường King
                // Bạn có thể bỏ qua các thuộc tính khác, chúng sẽ mang giá trị mặc định
                .createBedroom();           // Chốt hạ tạo phòng
		
		System.out.println("căn phòng vừa xây");
		System.out.println(myroom.toString());
	}

}
