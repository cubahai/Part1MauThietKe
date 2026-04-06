package Model;

public class BedroomBuilder implements RoomBuilder {
	   private String wallColor;
	   private int numberOfWindows;
	   private String bedSize;
	   private boolean hasEnsuite;
	   private String floorType;
	   private boolean hasAirConditor;
	   private String wardrobeSize;
	   private String lightingStyle;
	
	   //Khúc này thêm getter để lấy giá trị và gán vào thuộc tính của nó
	   public String getbedSize() {
		    return this.bedSize;
		}

		public String getwallColor() {
		    return this.wallColor;
		}
		
		public int getnumberOfWindows() {
			return this.numberOfWindows;
		}
		
		public String getfloorType() {
			return this.floorType;
		}
	   
		public boolean gethasEnsuite() {
			return this.hasEnsuite;
		}
		public boolean gethasAirConditor() {
			return this.hasAirConditor;
		}
		public String getwardrobeSize() {
			return this.wardrobeSize;
		}
		public String getlightingStyle() {
			return this.lightingStyle;
		}
		
		//Phương thức để tạo Bedroom
		public Bedroom createBedroom() {
		   return new Bedroom(this);
		}
		
//Phương thức setter
public BedroomBuilder setwallColor(String wallColor){
	this.wallColor = wallColor;
	return this;
}
public BedroomBuilder setnumberOfWindows(int numberOfWindows){
	this.numberOfWindows = numberOfWindows;
	return this;
}
public BedroomBuilder setbedSize(String bedSize){
	this.bedSize = bedSize;
	return this;
}
public BedroomBuilder sethasEnsuite(boolean hasEnsuite){
	this.hasEnsuite = hasEnsuite;
	return this;
}
public BedroomBuilder setfloorType(String floorType){
	this.floorType = floorType;
	return this;
}
public BedroomBuilder sethasAirConditor(boolean hasAirConditor){
	this.hasAirConditor = hasAirConditor;
	return this;
}
public BedroomBuilder wardrobeSize(String wardrobeSize){
	this.wardrobeSize = wardrobeSize;
	return this;
}
public BedroomBuilder lightingStyle(String lightingStyle){
	this.lightingStyle = lightingStyle;
	return this;
}
@Override
public Room build(){
	return new Bedroom(this);
}

}
