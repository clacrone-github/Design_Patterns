public class TestSoupBuffetBuilder {

	private static SoupBuffet createSoupBuffet(SoupBuffetBuilder soupBuffetBuilder) {
		soupBuffetBuilder.buildSoupBuffet();
		soupBuffetBuilder.setSoupBuffetName();
		soupBuffetBuilder.buildChickenSoup();
		soupBuffetBuilder.buildClamChowder();
		soupBuffetBuilder.buildFishChowder();
		soupBuffetBuilder.buildMinestrone();
		soupBuffetBuilder.buildPastaFazul();
		soupBuffetBuilder.buildTofuSoup();
		soupBuffetBuilder.buildVegetableSoup();
		
		return soupBuffetBuilder.getSoupBuffet();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoupBuffet bostonSoupBuffet = createSoupBuffet(new BostonSoupBuffetBuilder());
		System.out.println("At the " + bostonSoupBuffet.getSoupBuffetName() + bostonSoupBuffet.getTodaysSoups());
		
		SoupBuffet honoluluSoupBuffet = createSoupBuffet(new HonoluluSoupBuffetBuilder());
		System.out.println("At the " + honoluluSoupBuffet.getSoupBuffetName() + honoluluSoupBuffet.getTodaysSoups());
	}	
}
