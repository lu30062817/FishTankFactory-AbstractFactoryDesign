package shortglassesfactory.abstractfactorydesign;

public class TestApplication {

	public static void main(String[] args) {
SourceFishesFactory fishes=FactoryCreator.getSourceFishesFactory("fishes");
System.out.println(fishes.getFishesInfo("BETTA").getFishes());

SourceFishesFactory usage=FactoryCreator.getSourceFishesFactory("size");
System.out.println(usage.getSizeInfo("small").usedFor());

SourceFishesFactory water=FactoryCreator.getSourceFishesFactory("water");
System.out.println(water.getWaterInfo("TapWater").getWater());

		
	}

}
