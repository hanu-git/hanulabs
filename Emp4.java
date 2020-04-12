/* This is Named and Name less example */

class Emp4
{

	
				Emp4()
				{
								
								
								System.out.println("empty cons");
								
				}
				
				Emp4(int empid)
				{
			
								
								System.out.println("Empid ="+empid);
				
				}
				
				
				Emp4(String ename, double esal) //local variables
				{
								System.out.println("Emp name="+ ename);
								System.out.println("Emp Sal="+ esal);
				}
				
				
				public static void main(String[] args)
				{
				
								/* Named Object */
								System.out.println("Named Objects");
								Emp4 e1 = new Emp4();
								Emp4 e2 = new Emp4(10);
								Emp4 e3 = new Emp4("Swetha",20000.99);
								/* Name Less object */
								System.out.println("Name less Objects");
								new Emp4();
								new Emp4(10);
				    new Emp4("Swetha",20000.99);
				}
				
}