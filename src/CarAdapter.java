
public class CarAdapter implements Character{

	Car car;
	
	public CarAdapter(Car newCar) {
		car = newCar;
	}
	
	@Override
	public void move() {
		car.drive();
		
	}

	@Override
	public void shoot() {
		car.driveBy();
		
	}

	@Override
	public void talk() {
		car.honk();
		
	}

}
