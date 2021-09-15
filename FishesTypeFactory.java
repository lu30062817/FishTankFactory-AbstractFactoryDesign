package shortglassesfactory.abstractfactorydesign;

public class FishesTypeFactory extends SourceFishesFactory{

	@Override
	public Fishes getFishesInfo(String fishes) {
		if(fishes.equals("BETTA"))
			return new BettaFish();
		else if(fishes.equals("GOLD"))
			return new GoldFish();
		else if(fishes.equals("ANGLE"))
			return new AngleFish();
		else
			return null;
	}

	@Override
	public Size getSizeInfo(String size) {
		return null;
	}

	@Override
	public Water getWaterInfo(String type) {
		return null;
	}
	

}
