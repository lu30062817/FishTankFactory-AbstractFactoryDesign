package shortglassesfactory.abstractfactorydesign;

public abstract class SourceFishesFactory {
   
	public abstract Fishes getFishesInfo(String fishes);
	public abstract Size getSizeInfo(String size);
	public abstract Water  getWaterInfo(String type);	
}
