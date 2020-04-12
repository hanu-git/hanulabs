class Emp1
{

				int empid;
				String ename;
				double esal;
				
				Emp1()
				{
				empid = 000123;
				ename = "Hanu";
				esal  = 10000.99;
				}
				
				void disp()
				{
				
								System.out.println("emp id="+empid);
								System.out.println("emp name="+ename);
								System.out.println("emp sal="+esal);
								
				}
				
				public static void main(String[] args)
				{
								Emp1 e = new Emp1();
								e.disp();
								
				}
				
				
}