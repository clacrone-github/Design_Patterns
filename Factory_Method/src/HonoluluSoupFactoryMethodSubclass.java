public class HonoluluSoupFactoryMethodSubclass extends SoupFactoryMethod {
	public String makeBuffetName() {
        return "Honolulu Soup Buffet";
    }
	
    public ClamChowder makeClamChowder() {
        return new HonoluluClamChowder();
    }
    
    public FishChowder makeFishChowder() {
        return new HonoluluFishChowder();
    }
}
