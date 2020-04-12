class Parent
{
   
   void m1()   //overriden method
   {
      System.out.println(" Parent method");
   }
}


class Child extends Parent
{

				void m1()   //overriding method
				{
				
								System.out.println("Child method");
				
				}
				
				public static void main(String[] args)
				{
				
								new Child().m1();
				
				}
				
}