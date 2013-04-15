public class DENSUW_TESTING{
	
	boolean TEST_BADDIE = true;
	boolean TEST_ROOM = true;

	public static void main(String[] aArgs){
		Baddie lTestBaddie = new Baddie("Joe", 3, 3);
		System.out.println(lTestBaddie.getDamage());
		return;
	}
}
