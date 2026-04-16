package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class TeamSales implements Payee {
	 private List<Payee> members = new ArrayList<>();

	    public void addMember(Payee p) {
	        members.add(p);
	    }

	    public void payExpenses(int amount) {
	        for (Payee p : members) {
	            p.payExpenses(amount);
	        }
	    }
}
