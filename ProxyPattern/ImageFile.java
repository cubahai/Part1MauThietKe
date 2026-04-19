package ProxyPattern;

public class ImageFile implements DisplayObject {
	private String fileName;

    public ImageFile(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // Quá trình tốn tài nguyên
    }

    private void loadFromDisk() {
        System.out.println(">> Đang tải file ảnh nặng từ ổ đĩa: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Hiển thị hình ảnh: " + fileName);
    }
}