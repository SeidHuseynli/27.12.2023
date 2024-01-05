package work;

public enum TrafficLight {
	GREEN, YELLOW, RED;

	public void printNextColor() {
		switch (this) {
		case GREEN:
			System.out.println("Next color: YELLOW");
			break;
		case YELLOW:
			System.out.println("Next color: RED");
			break;
		case RED:
			System.out.println("Next color: GREEN");
			break;
		default:
			System.out.println("Sehv reng color");
			break;
		}
	}
}
