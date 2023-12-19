				
				
			
public class GenThree
	{
		public static void main ( String[]args )
		{
			int randomNum;
			int a = Integer.parseInt ( args[0] );
			int b = Integer.parseInt ( args[1] );
			int min = b;
			for ( int i = 0; i < 3; i++ )
			{
				randomNum = ( int )(Math.random() * (b - a )) + a;
				System.out.println ( randomNum );
				if ( randomNum < min )
				{
					min = randomNum;
				}
			}
			System.out.println( " The minimal generated number was " + min );
		}
	}
			
						