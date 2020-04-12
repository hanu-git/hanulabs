class Stat2
{

				int empid;  //instance Variable
				
				//Method 
				void t1()
				{
								System.out.println("Emp ID="+ empid);
				}
				//Intsnace Block
				{
								empid = 123;
								System.out.println("Instance Block");
				}
				
				//static Block
				static
				{
				
				System.out.println("Static Block");
				
				}
				
				
				public static void main(String[] args)
				{
				
							
								Stat2 t1 = new Stat2();
								
								t1.t1();
								
								Stat2 t2 = new Stat2();
								
								t2.t1();
								
				}
				
}