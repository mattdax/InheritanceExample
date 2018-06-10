package inheri;

public class Clothes {
	char size;
	int cost;
	String Color;
	private int manCost;
	public Clothes(char s,int c,String co, int m) {
		this.Color = co;
		this.cost = c;
		this.size = s;
		this.manCost = m;
	}
	
	public void changeCost(int p) {
		this.cost = p;
	}
	public int getManCost() {
		return manCost;
	}
}
