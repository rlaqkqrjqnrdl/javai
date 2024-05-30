package javai.model;

public class Porche implements Car {
	
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int speedUp(int km) {
		this.speed = this.speed + km;
		return this.speed;
	}

	@Override
	public boolean stop() {
		return false;
	}

	@Override
	public boolean isStart() {
		return false;
	}

}
