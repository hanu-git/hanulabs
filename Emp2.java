class Emp2
{

				int empid;
				String ename;
				double esal;
				
				Emp2(int empid, String ename, double esal) //local variables
				{
				
				/* Convert local values to Instace variables*/
				this.empid = empid;
				this.ename = ename;
				this.esal  = esal;
				
				}
				
				void disp()
				{
				
								System.out.println("emp id="+empid);
								System.out.println("emp name="+ename);
								System.out.println("emp sal="+esal);
								
				}
				
				public static void main(String[] args)
				{
								Emp2 e1 = new Emp2(123,"Hanu", 10000.99);
								e1.disp();
								Emp2 e2 = new Emp2(124,"Swetha", 20000.99);
								e2.disp();
								
				}
				
				
}