class HonoluluConcreteSoupFactory extends AbstractSoupFactory {
    
	public HonoluluConcreteSoupFactory() {
        this.factoryLocation = "Honolulu";
    }
	
    public ClamChowder makeClamChowder() {
       return new HonoluluClamChowder();
    }
    
    public FishChowder makeFishChowder() {
       return new HonoluluFishChowder();
    }
}
