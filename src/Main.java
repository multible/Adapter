
public class Main {

	public static void main(String[] args) {
		
		Protagonist winston = new Protagonist();
		
		Car tesla = new Car();
		
		Character carAdapter = new CarAdapter(tesla);
		
		carAdapter.talk();
		carAdapter.shoot();
		carAdapter.move();
		
		winston.talk();
		winston.shoot();
		winston.move();
		

	}

}
