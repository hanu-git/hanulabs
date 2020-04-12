interface logic1
{
  void m1();
  
}


interface logic2 extends logic1
{
  void m2();
  
}


interface logic3 extends logic2
{
  void m3();
  
}

class Inter2 implements logic3
{

				public void m1()
				{ System.out.println(" Interface logic1");}
				public void m2()
				{ System.out.println(" Interface logic2");}
				public void m3()
				{ System.out.println(" Interface logic3");}
				public static void main(String[] args)
				{
								Inter2 t1 = new Inter2();
								t1.m1();
								t1.m2();
								t1.m3();
				
				
				}
				
}




