package general;

enum Season {SPRING ("spring"), SUMMER ("summer"), FALL ("fall"), WINTER ("winter");
 
	private final String seasonName;
	private Season(String seasonName){
		this.seasonName=seasonName;
	}
	
	public String getsSeasonName(){
		return this.seasonName;
	}

}
enum Day {
	MONDAY , TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY		
 	}
public class EnumPractice {
 private Day today;
 
 public EnumPractice(Day today){
	 this.today=today;
 }
 public void todayActivity(Day day){
	 switch(day){
	 case SATURDAY:
		 System.out.println("Weekend approaching");
		 break;
	 case SUNDAY:
		 System.out.println("Today is holiday");
		 break;
	default:
		System.out.println("Today is workig day");
		break;
	 }
 }
 public static void main(String[] args){
	 String day="Sunday";
	 
	 EnumPractice enumPractice = new EnumPractice(Day.valueOf(day.toUpperCase()));
	 enumPractice.todayActivity(enumPractice.today);
	 String seasonNow="summer";
	 System.out.println(Season.SPRING.getsSeasonName());
 }
 
 
}
