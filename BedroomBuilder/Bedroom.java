package Model;

public class Bedroom implements Room {
   private String wallColor;
   private int numberOfWindows;
   private String bedSize;
   private boolean hasEnsuite;
   private String floorType;
   private boolean hasAirConditor;
   private String wardrobeSize;
   private String lightingStyle;
  
   
   //Khúc này tạo một cái để kết nối với BedroomBuilder
   
   public Bedroom(BedroomBuilder builder) {
	   this.wallColor = builder.getwallColor();
	   this.bedSize = builder.getbedSize();
	   this.floorType = builder.getfloorType();
	   this.numberOfWindows = builder.getnumberOfWindows();
	   this.hasEnsuite = builder.gethasEnsuite();
	   this.hasAirConditor = builder.gethasAirConditor();
	   this.wardrobeSize = builder.getwardrobeSize();
	   this.lightingStyle = builder.getlightingStyle();
	   
   }
	   public Bedroom(String wallColor, int numberOfWindows, String bedSize, boolean hasEnsuite, 
               String floorType, boolean hasAirConditor, String wardrobeSize, String lightingStyle) {
    this.wallColor = wallColor;
    this.numberOfWindows = numberOfWindows;
    this.floorType = floorType;
    this.numberOfWindows = numberOfWindows;
    this.hasEnsuite = hasEnsuite;
    this.hasAirConditor = hasAirConditor;
    this.wardrobeSize = wardrobeSize;
    this.lightingStyle = lightingStyle;
   }



}
