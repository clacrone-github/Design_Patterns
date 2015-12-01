abstract class AbstractSoupFactory {

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
}