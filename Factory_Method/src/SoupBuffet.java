public class SoupBuffet {
	String soupBuffetName;
	ChickenSoup chickenSoup;
	ClamChowder clamChowder;
	FishChowder fishChowder;
	Minestrone minestrone;
	PastaFazul pastaFazul;
	TofuSoup tofuSoup;
	VegetableSoup vegetableSoup;
	
	public String getSoupBuffetName() {
		return soupBuffetName;
	}
	
	public void setSoupBuffetName(String soupBuffetNameIn) {
	    this.soupBuffetName = soupBuffetNameIn;
	}

	public void setChickenSoup(ChickenSoup chickenSoup) {
		this.chickenSoup = chickenSoup;
	}
	
	public void setClamChowder(ClamChowder clamChowder) {
		this.clamChowder = clamChowder;
	}
	
	public void setFishChowder(FishChowder fishChowder) {
		this.fishChowder = fishChowder;
	}
	
	public void setMinestrone(Minestrone minestrone) {
		this.minestrone = minestrone;
	}
	
	public void setPastaFazul(PastaFazul pastaFazul) {
		this.pastaFazul = pastaFazul;
	}
	
	public void setTofuSoup(TofuSoup tofuSoup) {
		this.tofuSoup = tofuSoup;
	}
	
	public void setVegetableSoup(VegetableSoup vegetableSoup) {
		this.vegetableSoup = vegetableSoup;
	}
	
	public String getTodaysSoups() {
		StringBuffer result = new StringBuffer();
		result.append(" Today's Soups: \n");
		
		result.append(" Chicken Soup: ");
		result.append(this.chickenSoup.getSoupName() + "\n");
		
		result.append(" Clam Chowder: ");
		result.append(this.clamChowder.getSoupName() + "\n");
		
		result.append(" Fish Chowder: ");
		result.append(this.fishChowder.getSoupName() + "\n");
		
		result.append(" Minestrone: ");
		result.append(this.minestrone.getSoupName() + "\n");
		
		result.append(" Pasta Fazul: ");
		result.append(this.pastaFazul.getSoupName() + "\n");
		
		result.append(" Tofu Soup: ");
		result.append(this.tofuSoup.getSoupName() + "\n");
		
		result.append(" Vegetable Soup: ");
		result.append(this.vegetableSoup.getSoupName() + "\n");
		
		return result.toString();
	}
}
