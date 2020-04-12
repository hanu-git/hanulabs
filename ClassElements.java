class ClassElements
{

   int instanceVariable = 100;   																																	// Instance Variable
   
   static  String staticVariable = "To test static variable"  ;   // Static Variable
   
   ClassElements()     																																							 		 // 0 arguments constructor
   {
   
     this(10);  																																																  // Using This keyword
     System.out.println("To test 0 argument constructor");
   }
   
   ClassElements(int a)                                           // 1 arguments constructor
   {
     this(100,200);																																													   // Using This keyword
     System.out.println("To test 1 argument constructor, a="+a);
   }
   
   ClassElements(int x, int y)  																																		// 2 arguments constructor
   {
     System.out.println("To test 2 arguments constructor, x="+x+"  y="+y);
   }
   
   void method1()           																																						// Method declartion 
   {
					System.out.println("This is to test method, Instance Variable = "+instanceVariable+", Static Variable = "+ ClassElements.staticVariable);
   }
   
   static                   																																					 // Statc Block
   {
				 System.out.println("To test static block ");
   }
																																																																		// Instace Block
   {
     System.out.println("To test instace block ");
   }
   
   
   public static void main(String[] args)                         // Main method
   {
   
     System.out.println("Named object ");
     ClassElements e1 = new ClassElements();
     e1.method1();
     
     System.out.println("Name less object ");
     
     new ClassElements();
     
   }
}