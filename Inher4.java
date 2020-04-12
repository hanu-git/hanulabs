class A1
{
   
   {
				System.out.println("Instance Block of A");
   }
   
   A1(int a)
   {
     System.out.println("Constructor A, value of a="+ a);
   }
   
  
}

class Inher4 extends A1					//extends keyword to obtain inheritance
{
				
				{
				System.out.println("Instance Block of Inher4");
    }
				
				
				Inher4()
				{
				 super(100);
     System.out.println("Constructor in child Inher");
				}
				
				public static void main(String[] args)
   {
        Inher4 c1 = new Inher4();
        
   
        
        
   }

}