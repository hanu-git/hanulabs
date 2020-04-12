// Inheritance example
//Inher1.java  - program name 

class A
{
   void m1(){ System.out.println("method m1");}
   void m2(){System.out.println("method m2");}
   
  /* public static void main(String[] args)    //Not needed when chile class a objet
   {
         A a1 = new A();
   } */
}


class B extends A       //extends keyword to obtain inheritance
{
				void m3(){System.out.println("method m3");}
				void m4(){System.out.println("method m4");}
				
		/*	
				public static void main(String[] args)    //Not needed when chile class a objet
   {
         B b1 = new B();
   }  */

}

class Inher1 extends B						//extends keyword to obtain inheritance
{
				void m5(){System.out.println("method m5");}
				void m6(){System.out.println("method m6");}
				
				public static void main(String[] args)
   {
        Inher1 c1 = new Inher1();
        
        c1.m1();
        c1.m2();
        c1.m3();
        c1.m4(); 
        c1.m5(); 
        c1.m6(); 
   }

}

/*
class D extends A,A,C						//multiplle inheritance is not possible
{
				void m5(){}
				void m6(){}

}  */