
public class Cup {
	Die one = new Die();
	Die two = new Die();
	private int total = 0;
	
	public Cup() {
		
	}
	
	public int getTotal() {
		return total;
	}
	
	public void rollDice(Die one, Die two) {
		one.roll();
		two.roll();
	}
	
	public int getValue(Die d) {
		return d.getFaceValue();
	}
	
	public void setValue(int a, int b, int total) {
		one.setFaceValue(a);
		two.setFaceValue(b);
		this.total = total;
	}
	
	public int getDiceSum(Die one, Die two) {
		
		total += one.getFaceValue() + two.getFaceValue();
		
		return total;
	}
	
	public String toString() {
		String a = "Total is " + total + "\n";
		System.out.println(a);
		return a;
	}
	
	public boolean equals(Die one, Die two) {
		
		if (this.one.getFaceValue() == one.getFaceValue() && this.one.getFaceValue() == two.getFaceValue()) {
			return true;
		}else{
			return false;
		}
	}
}
