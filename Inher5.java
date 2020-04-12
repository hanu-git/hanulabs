class A1
{
   static
   {
				System.out.println("Instance Block of A");
   }
   
   A1(int a)
   {
     System.out.println("Constructor A, value of a="+ a);
   }
   
  
}

class Inher5 extends A1					//extends keyword to obtain inheritance
{
				static
				{
				System.out.println("Instance Block of Inher5");
    }
				
				
				Inher5()
				{
				 super(100);
     System.out.println("Constructor in child Inher");
				}
				
				public static void main(String[] args)
   {
        Inher5 c1 = new Inher5();
        
   
        
        
   }

}