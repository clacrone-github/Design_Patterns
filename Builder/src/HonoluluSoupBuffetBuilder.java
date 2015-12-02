public class HonoluluSoupBuffetBuilder extends SoupBuffetBuilder {

	@Override
	public void setSoupBuffetName() {
		// TODO Auto-generated method stub
		this.soupBuffet.soupBuffetName = "Honolulu Soup Buffet";
	}
	
	public void buildClamChowder() {
		this.soupBuffet.clamChowder = new HonoluluClamChowder();
	}
	
	public void buildFishChowder() {
		this.soupBuffet.fishChowder = new HonoluluFishChowder();
	}
}
