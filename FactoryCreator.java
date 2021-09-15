package shortglassesfactory.abstractfactorydesign;

public class FactoryCreator {
	
public static SourceFishesFactory getSourceFishesFactory(String input)
	{
	   if(input.equals("fishes"))
		   return new FishesTypeFactory();
	   else if(input.equals("size"))
		   return new SizeFactory();
	   else if(input.equals("water"))
		   return new WaterFactory();
	   else
		   return null;
	}

}
