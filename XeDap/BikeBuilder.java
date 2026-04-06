package Wheel;

public class BikeBuilder {

	public static void main(String[] args) {
		//Khởi tạo một nhà máy xe đạp địa hình
        BikeFactory factory = new MountainBikeFactory();
        
        //Builder sử dụng nhà máy để lấy bánh xe
        Wheel wheel = factory.getWheel();
        System.out.println("Đang lắp ráp xe đạp :" + wheel.getDescription());
	}

}
