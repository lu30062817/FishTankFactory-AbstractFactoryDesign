package shortglassesfactory.abstractfactorydesign;

public class SizeFactory extends SourceFishesFactory{

	@Override
	public Fishes getFishesInfo(String fishes) {
		return null;
	}

	@Override
	public Size getSizeInfo(String size) {
		if(size.equals("small"))
			return new Small();
		else if(size.equals("medium"))
			return new Medium();
		else if(size.equals("large"))
			return new Large();
		else
			return null;
	}

	@Override
	public Water getWaterInfo(String type) {
		return null;
	}
	

}
