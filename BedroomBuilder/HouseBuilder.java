package Model;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
    private int numberOfStories;
    private List<Room> rooms;

    // Constructor: Khởi tạo một danh sách phòng trống khi bắt đầu xây nhà
    public HouseBuilder() {
        this.rooms = new ArrayList<>();
    }

    // --- GETTERS (để lớp House lấy dữ liệu) ---
    public int getNumberOfStories() { return numberOfStories; }
    public List<Room> getRooms() { return rooms; }

    
    public HouseBuilder setNumberOfStories(int numberOfStories) {
        this.numberOfStories = numberOfStories;
        return this;
    }

 
    public House build() {
        return new House(this);
    }
    
    public HouseBuilder addRoom(Room room) {
		return this;
    
    }
}