public class Coins 
{
	public static void main ( String [] args )
	{
		int givenamount = Integer.parseInt ( args[0] );
		int quarteramount;
		int centamount;
		quarteramount = givenamount / 25;
		centamount = givenamount % 25;
		System.out.println ( " Use " + quarteramount + " quarters and " + centamount + " cents " );
	}
}
				