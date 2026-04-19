package ProxyPattern;

public class ImageGallery {

	public static void main(String[] args) {
		// Tạo danh sách ảnh (Lúc này chưa có file nào được tải vào RAM)
        DisplayObject img1 = new ImageProxy("nature_4k.jpg");
        DisplayObject img2 = new ImageProxy("space_highres.png");
        DisplayObject img3 = new ImageProxy("ocean_wallpaper.jpg");

        System.out.println("--- Album đã sẵn sàng (chưa tốn RAM) ---");

        // Khi người dùng lướt đến ảnh nào, ảnh đó mới được tải
        System.out.println("\nNgười dùng xem ảnh 1:");
        img1.display(); 

        System.out.println("\nNgười dùng xem lại ảnh 1 (không cần tải lại):");
        img1.display(); 

        System.out.println("\nNgười dùng xem ảnh 3:");
        img3.display();
    }
}