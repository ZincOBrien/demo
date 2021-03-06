public class MyOwnException
{
		public static void main(String[] args)
		{
			try
			{
				MyOwnException.myTest("this is a test"); // test not null string
				//MyOwnException.myTest(null); // test null string w/ exception
			}
			catch(MyAppException mae)
			{
				System.out.println("Inside catch block: " + mae.getMessage());
			}
		}//end of main
		
		static void myTest(String str) throws MyAppException
		{
			if(str == null)
			{
				throw new MyAppException("String val is null");
			}
			else
			{
				System.out.println("All's good!");
			}
			
		}//end of mytest
} // end of class myownexception


		class MyAppException extends Exception
{
			private String message = null;
			public MyAppException()
			{
				super();
			}
			
			public MyAppException(String message)
			{
				super(message);
				this.message = message;
			}
			
			public MyAppException(Throwable cause)
			{
				super(cause);
			}
			@Override
			public String toString()
			{
				return message;
			}
			
			@Override
			public String getMessage()
			{
				return message;
			}
						
}// end of class MyAppExtension