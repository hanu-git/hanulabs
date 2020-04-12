
class Food
{
}

class Biryani extends Food
{
}


class Parent
{
   
   Food m1()   //overriden method
   {
      System.out.println(" Parent method");
      return new Food();
   }
}


class Child extends Parent
{

				Biryani m1()   //overriding method
				{
				
								System.out.println("Child method");
								return new Biryani();
				
				}
				
				public static void main(String[] args)
				{
				
								new Child().m1();
				
				}
				
}