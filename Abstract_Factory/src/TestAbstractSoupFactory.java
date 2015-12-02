import java.util.Calendar;

public class TestAbstractSoupFactory { 
   
	public static Soup MakeSoupOfTheDay(AbstractSoupFactory concreteSoupFactory) { 
       
		Calendar currentCalendar = Calendar.getInstance();
//		int dayOfWeek = currentCalendar.get(Calendar.DAY_OF_WEEK);
        int dayOfWeek = Calendar.SUNDAY;
        
		switch(dayOfWeek) {
			case Calendar.MONDAY:
				return concreteSoupFactory.makeChickenSoup();
			case Calendar.TUESDAY:
				return concreteSoupFactory.makeClamChowder();
			case Calendar.WEDNESDAY:
				return concreteSoupFactory.makeFishChowder();
			case Calendar.THURSDAY:
				return concreteSoupFactory.makeMinnestrone();
			case Calendar.FRIDAY:
				return concreteSoupFactory.makePastaFazul();
			case Calendar.SATURDAY:
				return concreteSoupFactory.makeTofuSoup();
	    	default:
	    		return concreteSoupFactory.makeVegetableSoup();
	   }
//       if (dayOfWeek == Calendar.MONDAY) {
//           return concreteSoupFactory.makeChickenSoup();
//       } else if (dayOfWeek == Calendar.TUESDAY) {
//           return concreteSoupFactory.makeClamChowder();
//       } else if (dayOfWeek == Calendar.WEDNESDAY) {
//           return concreteSoupFactory.makeFishChowder();
//       } else if (dayOfWeek == Calendar.THURSDAY) {
//           return concreteSoupFactory.makeMinnestrone();
//       } else if (dayOfWeek == Calendar.FRIDAY) {
//           return concreteSoupFactory.makePastaFazul();
//       } else if (dayOfWeek == Calendar.SATURDAY) {
//           return concreteSoupFactory.makeTofuSoup();
//       } else {
//           return concreteSoupFactory.makeVegetableSoup();
//       }
   }        


   public static void main(String[] args) {
	   AbstractSoupFactory soupFactory = new BostonConcreteSoupFactory();
	   Soup soupOfTheDay = MakeSoupOfTheDay(soupFactory);
	   System.out.println("The Soup of the day " + soupFactory.getFactoryLocation() + " is " + soupOfTheDay.getSoupName());
	 
	   soupFactory = new HonoluluConcreteSoupFactory();
	   soupOfTheDay = MakeSoupOfTheDay(soupFactory);
	   System.out.println("The Soup of the day " + soupFactory.getFactoryLocation() + " is " + soupOfTheDay.getSoupName());
   }
}
