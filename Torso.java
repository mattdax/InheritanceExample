package inheri;

public class Torso extends Clothes {
	String type;
	int pockets;
	
	
	public Torso(char s, int c, String co, int m, String t, int p) {
		super(s, c, co, m);
		this.type = t;
		this.pockets = p;
		
		// TODO Auto-generated constructor stub
	}

}
