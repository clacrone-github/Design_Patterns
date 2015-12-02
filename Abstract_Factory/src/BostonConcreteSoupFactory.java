class BostonConcreteSoupFactory extends AbstractSoupFactory {
    
	public BostonConcreteSoupFactory() {
        this.factoryLocation = "Boston";
    }
	
    public ClamChowder makeClamChowder() {
        return new BostonClamChowder();
    }
    
    public FishChowder makeFishChowder() {
        return new BostonFishChowder();
    }
}
