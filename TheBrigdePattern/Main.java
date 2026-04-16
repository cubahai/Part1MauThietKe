package TheBrigdePattern;

public class Main {

	public static void main(String[] args) {
		// Điều khiển TV bằng remote cơ bản
        Device tv = new Tv();
        Remote basicRemote = new Remote(tv);
        basicRemote.togglePower();

        // Điều khiển Radio bằng remote xịn (có nút Mute)
        Device radio = new Radio();
        AdvancedRemote advRemote = new AdvancedRemote(radio);
        advRemote.togglePower();
        advRemote.mute();
    }

}
