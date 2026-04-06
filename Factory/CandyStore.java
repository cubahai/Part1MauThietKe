package candyfactory;

public class CandyStore {
	public Candy orderCandy(String type) {
        Candy candy = CandyFactory.createCandy(type);
        candy.produce();
        return candy;
    }
}
