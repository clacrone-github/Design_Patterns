public abstract class SoupBuffetBuilder {

	SoupBuffet soupBuffet;
	
	public SoupBuffet getSoupBuffet() {
		return this.soupBuffet;
	}
	
	public void buildSoupBuffet() {
		this.soupBuffet = new SoupBuffet();
	}
	
	public abstract void setSoupBuffetName();
	
	public void buildChickenSoup() {
		this.soupBuffet.chickenSoup = new ChickenSoup();
	}
	
	public void buildClamChowder() {
		this.soupBuffet.clamChowder = new ClamChowder();
	}
	
	public void buildFishChowder() {
		this.soupBuffet.fishChowder = new FishChowder();
	}
	
	public void buildMinestrone() {
		this.soupBuffet.minestrone = new Minestrone();
	}
	
	public void buildPastaFazul() {
		this.soupBuffet.pastaFazul = new PastaFazul();
	}
	
	public void buildTofuSoup() {
		this.soupBuffet.tofuSoup = new TofuSoup();
	}
	
	public void buildVegetableSoup() {
		this.soupBuffet.vegetableSoup = new VegetableSoup();
	}
}
