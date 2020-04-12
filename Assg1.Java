class Assg1
{
				static int a=100;
				static int b=200;
				
				int x=150;
				int y=250;
				
				public static void main (String[] args)
				{
				    //Instance Variable printing
				    Assg1 t = new Assg1();
								System.out.println(t.x);
				    System.out.println(t.y);
				    
				    //Static Variable printing
								System.out.println(Assg1.a);
				    System.out.println(Assg1.b);
				    
				    //Call static method
				    Assg1.m1();
				    
								//Call instance method
								t.m2();
				}
				
				static void m1()
				{
								Assg1 t = new Assg1();
				    System.out.println(Assg1.a);
				    System.out.println(Assg1.b);
				    System.out.println(t.x);				    
								System.out.println(t.y);
				    
				}
				
				void m2()
				{
				    System.out.println(x);				    
								System.out.println(y);
				    
				}
				
	}