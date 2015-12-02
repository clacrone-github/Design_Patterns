public class BostonSoupBuffetBuilder extends SoupBuffetBuilder {

	public void setSoupBuffetName() {
		this.soupBuffet.soupBuffetName = "Boston Soup Buffet";
	}
	
	public void buildClamChowder() {
		this.soupBuffet.clamChowder = new BostonClamChowder();
	}
	
	public void buildFishChowder() {
		this.soupBuffet.fishChowder = new BostonFishChowder();
	}
}
