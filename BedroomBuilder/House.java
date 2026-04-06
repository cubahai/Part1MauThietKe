package Model;

import java.util.List;

public class House {
      
    	   private int numberOfStories; //Số Tầng
    	   private List<Room> rooms ; //Danh sách các phòng
    	   
    	   // Constructor chuẩn của Builder Pattern 
    	   public House(HouseBuilder builder) {
    		   this.numberOfStories = builder.getNumberOfStories();
    		   this.rooms = builder.getRooms();
    	   }
       }

