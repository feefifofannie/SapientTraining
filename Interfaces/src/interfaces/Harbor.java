package interfaces;

public class Harbor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harbor bostonHarbor = new Harbor();
		RiverBarge barge = new RiverBarge();
		SeaPlane sPlane = new SeaPlane();
		
		bostonHarbor.givePermissionToDock(barge);
		bostonHarbor.givePermissionToDock(sPlane);
	}

	private void givePermissionToDock(Sailer s){
		s.dock();
	}
}
