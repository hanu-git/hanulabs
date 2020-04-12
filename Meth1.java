//Method Overloading example 

class MethOver1
{

				void m1()
				{
								
								System.out.println("This is 0 argument method");
				}
				
				void m1(int a)
				{
								System.out.println("This is 1 argument method a="+a);
				}
				
				public static void main(String[] agrs)
				{
				
								Meth1 m1 = new Meth1();
								m1.m1();
								m1.m1(100);
							
				}

}