interface logic    // defualt - Abstract class
{


   void m1();   //defualt - Public abstract method
   
}


class Inter1 implements logic
{


				public void m1()
				{
								System.out.println("this is to test interface methods");
								
				}
				
				public static void main(String[] args)
				{
												Inter1 t1 = new Inter1();
												t1.m1();
												
												logic t2 = new Inter1();
												t2.m1();
				}


}