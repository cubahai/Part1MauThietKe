package Wheel;

public class RoadBikeFactory extends BikeFactory {

	@Override
	public Wheel getWheel() {
		// TODO Auto-generated method stub
		return new RoadBikeWheel();
	}

}
