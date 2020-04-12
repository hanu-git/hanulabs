/*Const1 t = new Test();
Test --- Class name;
t ------ ref variable 
= ------ Assignment operator 
new ---- keyword (used to create the Object)
Test() ---- constructor


Rules to declare constructors in java:
-------------------------------------
1. cons - name and class name must be same
2. cons able to take params
3. cons donot return values.

Types of constructors:
1. Default cons - defind by compiler
2. User cons  - defind by user*/

class Const1
{


     void m1() //Instance method
     {
         System.out.println("m1 method");
     }
     
     /* Default cons
     Const1()
     {//empty implimentation
     }*/
     
				public static void main(String[] args)
				{
								Const1 t = new Const1();  //Test() - constructor
								t.m1();
				}
				

}


