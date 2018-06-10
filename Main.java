package inheri;

public class Main {

	public static void main(String[] args) {
		Clothes pants = new Legs('L', 30, "Red", 5, 60, true);
		pants.changeCost(40);
		System.out.println(pants.getManCost());
	}

}
