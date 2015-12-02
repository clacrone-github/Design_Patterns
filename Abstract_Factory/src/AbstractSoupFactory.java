public abstract class AbstractSoupFactory {
	String factoryLocation;

	public String getFactoryLocation() {
        return factoryLocation;
    }
    
    public ChickenSoup makeChickenSoup() {
        return new ChickenSoup();
    }
    
    public ClamChowder makeClamChowder() {
        return new ClamChowder();
    }
    
    public FishChowder makeFishChowder() {
        return new FishChowder();
    }     
    
    public Minestrone makeMinestrone() {
        return new Minestrone();
    }
    
    public PastaFazul makePastaFazul() {
        return new PastaFazul();
    }
    
    public TofuSoup makeTofuSoup() {
        return new TofuSoup();
    }
    
    public VegetableSoup makeVegetableSoup() {
        return new VegetableSoup();
    }
}
