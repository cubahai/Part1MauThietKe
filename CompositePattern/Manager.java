package CompositePattern;

public class Manager implements Payee {
   String name;
   public void payExpenses(int amount) {
	   System.out.println(name + "thanh toan" + amount);
   }
} 
