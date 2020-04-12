/* This is Constructors calling example */

class Emp3
{

	
				Emp3()
				{
								
								this(123);
								System.out.println("empty cons");
								
				}
				
				Emp3(int empid)
				{
			
								this("Swetha",20000.99);
								System.out.println("Empid ="+empid);
				
				}
				
				
				Emp3(String ename, double esal) //local variables
				{
								System.out.println("Emp name="+ ename);
								System.out.println("Emp Sal="+ esal);
				}
				
				
				public static void main(String[] args)
				{
								Emp3 e1 = new Emp3();
								
				}
				
				
}