package interfaces;

public class Airport {

	public static void main(String[] args) {
		Airport metropolis = new Airport();
		Helicopter copter = new Helicopter();
		SeaPlane sPlane = new SeaPlane();
		
		metropolis.givePermissionToLand(copter);
		metropolis.givePermissionToLand(sPlane);
	}
	
	private void givePermissionToLand(Flyer f){
		f.land();
	}

}
