package ProxyPattern;

public class ImageProxy implements DisplayObject {
    private String fileName;
    private ImageFile realImage; // Đối tượng thật sự

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Chỉ khởi tạo ImageFile khi thực sự cần hiển thị
        if (realImage == null) {
            realImage = new ImageFile(fileName);
        }
        realImage.display();
    }
}