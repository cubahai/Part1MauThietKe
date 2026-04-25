package DecoratorPattern;

public class RedBorderDecorator implements Component{
	protected Component decoratedComponent;

    public RedBorderDecorator(Component component) {
        this.decoratedComponent = component;
    }

    @Override
    public void draw() {
        // Gọi hàm vẽ gốc của đối tượng
        decoratedComponent.draw();
        // Thêm tính năng mới (viền đỏ)
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Border Color: Đỏ");
    }
}