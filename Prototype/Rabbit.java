package prototypePattern;

public class Rabbit implements Cloneable {
    private int age;
    private Person owner; // Giải quyết lỗi 1 và chuẩn bị cho deep copy

    // Constructor giải quyết lỗi 1
    public Rabbit(int age, Person owner) {
        this.age = age;
        this.owner = owner;
    }

    // Getter giải quyết lỗi 3
    public Person getOwner() {
        return owner;
    }

    // Setter
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // Ghi đè phương thức clone() để thực hiện deep copy cho bài 5b
    @Override
    public Rabbit clone() {
        try {
            // Bước 1: Sao chép các kiểu dữ liệu nguyên thủy (age)
            Rabbit clonedRabbit = (Rabbit) super.clone();
            
            // Bước 2: GIẢI QUYẾT BÀI 5B (Deep Copy)
            // Thay vì dùng chung tham chiếu, ta tạo một đối tượng Person mới dựa trên người chủ cũ
            clonedRabbit.owner = new Person(this.owner); 
            
            return clonedRabbit;
        } catch (CloneNotSupportedException e) {
            // Điều này sẽ không xảy ra vì chúng ta implement Cloneable
            throw new RuntimeException("Lỗi khi clone Rabbit", e);
        }
    }

    @Override
    public String toString() {
        return "Rabbit [Age=" + age + ", Owner=" + owner + "]";
    }
}