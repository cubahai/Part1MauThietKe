package prototypePattern;

	public class Main {
	    public static void main(String[] args) {
	        // Tạo con thỏ gốc
	        Person ownerAlice = new Person("Alice");
	        Rabbit originalRabbit = new Rabbit(1, ownerAlice);
	        
	        // Nhân bản (Clone) - Giải quyết lỗi 2 bằng cách ép kiểu sang Rabbit
	        Rabbit clonedRabbit = (Rabbit) originalRabbit.clone();
	        
	        // Thay đổi tên người chủ của thỏ GỐC
	        originalRabbit.getOwner().setName("Bob");
	        
	        System.out.println("Gốc: " + originalRabbit); 
	        // Kết quả mong đợi: Rabbit [Age=1, Owner=Owner{name='Bob'}]
	        
	        System.out.println("Clone: " + clonedRabbit); 
	        // Kết quả mong đợi: Rabbit [Age=1, Owner=Owner{name='Alice'}]
	        // Nhờ deep copy, người chủ của con thỏ clone vẫn là Alice!
	    }
	
	}


