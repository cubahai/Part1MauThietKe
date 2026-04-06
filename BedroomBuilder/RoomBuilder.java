package Model;

public interface RoomBuilder {
   RoomBuilder setwallColor(String wallColor);
   RoomBuilder setnumberOfWindows(int numberOfWindows);
   RoomBuilder setfloorType(String floorType);
   RoomBuilder lightingStyle(String lightingStyle);
   
   Room build();
}
