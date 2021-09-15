package shortglassesfactory.abstractfactorydesign;

public class WaterFactory extends SourceFishesFactory{

	@Override
	public Fishes getFishesInfo(String fishes) {
		return null;
	}

	@Override
	public Size getSizeInfo(String size) {
		return null;
	}

	@Override
	public Water getWaterInfo(String type) {
		if(type.equals("TapWater"))
			return new TapWater();
		else if(type.equals("RoWater"))
			return new RoWater();
		else
			return null;
	}
	

}
