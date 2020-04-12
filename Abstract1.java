abstract class Abstract1

{
				abstract void m1();
				void m2() { System.out.println("M2 method");}


}

class Abstract2 extends Abstract1
{

				void m1() { System.out.println("M1 method");}
				public static void main (String[] args)
				{
								//Abstract1 t = new Abstract1();   Object creation is not possible as this calss is abstarct class

								Abstract2 t1 = new Abstract2();
								t1.m1();
								
								
								Abstract1 t2 = new Abstract2();  // using abstract class variable with normal ojbect
								
								t2.m1();
								t2.m2();
				}
}