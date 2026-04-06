package Wheel;

public class MountainBikeFactory extends BikeFactory{

	@Override
	public Wheel getWheel() {
		// TODO Auto-generated method stub
		return new MountainBikeWheel();
	}
  
}
