class Const3
{
  
     Const3(int a,int b,int c)
     {
								int d;
								System.out.println("1- arg cons");
								System.out.println(a);
								System.out.println(b);
								System.out.println(c);
								
								d = (a+b)/c;
								System.out.println(d);
								
     }
     
				public static void main(String[] args)
				{

								Const3 t1 = new Const3(100,200,300);
				}
				

}
