package Singleton;

import java.util.Collections;
import java.util.List;

public class NetworkConnector {
   //Bien static private de luu tru instance duy nhat
	private static NetworkConnector instance;
	
	//Khai báo một danh sách chứa các tài nguyên cốt lõi 
	private List<String> coreResources;
	
	
  //Constructor private de ngan class co the goi "NetworkConnector"
	private NetworkConnector() {
		System.out.println("Đang khởi tạo kết nối mạng......");
		coreResources = Collections.singletonList("192.168.1.100");
}
  //Phuong thuc public static cung cap diem truy cap duy nhat cho toan bo
	public static synchronized NetworkConnector getInstance() {
		if (instance == null) {
			instance = new NetworkConnector();
		}
		return instance;
	}
		// Phương thức để các class khác lấy tài nguyên ra sử dụng
	    public List<String> getCoreResources() {
	        return coreResources;
	}
}