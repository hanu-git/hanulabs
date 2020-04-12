class A1
{
   
   A1(int a)
   {
     System.out.println("Constructor A, value of a="+ a);
   }
   
  
}

class Inher3 extends A1					//extends keyword to obtain inheritance
{
				
				Inher3()
				{
				 super(100);
     System.out.println("Constructor in child Inher");
				}
				
				public static void main(String[] args)
   {
        Inher3 c1 = new Inher3();
        
   
        
        
   }

}