class SeattleConcreteSoupFactory extends AbstractSoupFactory {
    
	public SeattleConcreteSoupFactory() {
        this.factoryLocation = "Seattle";
    }
	
    public ChickenSoup makeChickenSoup() {
       return new SeattleChickenSoup();
    }
    
    public Minestrone makeMinestrone() {
       return new SeattleMinestrone();
    }
}