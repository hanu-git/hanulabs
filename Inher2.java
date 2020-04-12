// Inheritance example - method and constructors
//Inher2.java  - program name 

class A
{
   void m1(){ System.out.println("method m1");}
   void m2(){System.out.println("method m2");}
   
   A()
   {
     System.out.println("Constructor A");
   }
   
  /* public static void main(String[] args)    //Not needed when chile class a objet
   {
         A a1 = new A();
   } */
}

/*
class B extends A       //extends keyword to obtain inheritance
{
				void m3(){System.out.println("method m3");}
				void m4(){System.out.println("method m4");}
				
				B(int A)
				{
     System.out.println("Constructor B");
				} */
				
				
		/*
				public static void main(String[] args)    //Not needed when chile class a objet
   {
         B b1 = new B();
   }  

}

*/
class Inher2 extends A					//extends keyword to obtain inheritance
{
				void m5(){System.out.println("method m5");}
				void m6(){System.out.println("method m6");}
				
				Inher2()
				{
				 
     System.out.println("Constructor in child Inher");
				}
				
				

				Inher2(int A)
				{
				 super();
     System.out.println("Constructor in child");
				}
				
				public static void main(String[] args)
   {
        Inher2 c1 = new Inher2();
        
        c1.m1();
        c1.m2();
        c1.m5(); 
        c1.m6(); 
        
        new Inher2(100);
   }

}