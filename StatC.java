class StatC
{

				
				//static Block
				static
				{
				
				System.out.println("Static Block C");
				
				}
				
				public static void main(String[] args) throws ClassNotFoundException
				{
				
												new StatA();
												new StatB();
												new StatC();
												
													System.out.println("using for name");
													
												Class.forName("StatA");
												Class.forName("StatB");
												
				}
				
		
				
}