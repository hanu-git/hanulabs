class Const2
{


     void m1() //Instance method
     {
         System.out.println("m1 method");
     }
     
     Const2()
     {
								System.out.println("0- arg cons");
								
     }
  
     Const2(int a)
     {
								System.out.println("1- arg cons");
								System.out.println(a);
     }
     
				public static void main(String[] args)
				{
								Const2 t = new Const2();  //Const2() - constructor
								t.m1();

								Const2 t1 = new Const2(100);
								t1.m1();
				}
				

}
