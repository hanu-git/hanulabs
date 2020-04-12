interface logic1
{

   int a = 10;
   
}

interface logic2
{

   int a = 100;
   
}


class Inter3 implements logic1,logic2
{

				public static void main(String[] args)
				{
				
				System.out.println("Test interface variables"+ logic1.a);
				System.out.println("Test interface variables"+ logic2.a);
				}
}