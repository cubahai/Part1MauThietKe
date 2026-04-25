package DecoratorPattern;

public class Canvas {
	public static void main(String[] args) {
        // Hình tròn 1: Bình thường
        Component circle1 = new Circle();

        // Hình tròn 2: Được trang trí thêm viền đỏ
        Component circle2 = new RedBorderDecorator(new Circle());

        System.out.println("--- Drawing Circle 1 ---");
        circle1.draw();

        System.out.println("\n--- Drawing Circle 2 (Decorated) ---");
        circle2.draw();
    }
}