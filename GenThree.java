public class GenThree
	{
		public static void main ( String[]args )
		{
			int a = Integer.parseInt ( args[0] );
			int b = Integer.parseInt ( args[1] );
			int randomIntger1 = ( int )(Math.random() * (b - a + 1)) + a;
			int randomIntger2 = ( int )(Math.random() * (b - a + 1)) + a;
			int randomIntger3 = ( int )(Math.random() * (b - a + 1)) + a;
			System.out.println ( randomIntger1 );
			System.out.println ( randomIntger2 );	
			System.out.println ( randomIntger3 );
			int min = randomIntger1;
			if ( min < randomIntger2 && min < randomIntger3 )
			{
				System.out.println ( " The minimal generated number was " + min );
			}
			else if ( randomIntger2 < min && randomIntger2 < randomIntger3 )
			{
				System.out.println ( " The minimal generated number was " + randomIntger2 );
			}
			else
			{
				System.out.println ( " The minimal generated number was " + randomIntger3 );
			}
		}
	}
			
						