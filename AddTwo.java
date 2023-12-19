public class AddTwo
	{
		public static void main ( String[]args )
		{	
			int firstNum = Integer.parseInt ( args[0] );
			int secondNum = Integer.parseInt ( args[1] );
			int sum = firstNum + secondnum;
			System.out.println ( firstNum + " + " + secondNum + " = " + sum );
		}
	}