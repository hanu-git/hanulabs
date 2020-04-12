// Constructor overloading example

class ConsOver
{

				ConsOver()
				{System.out.println(" 0 Argument constructor");
				
				}
				
				ConsOver(int a)
				{System.out.println(" 1 Argument constructor with int"+ a);
				
				}
				
				ConsOver(char a)
				{System.out.println(" 1 Argument constructor with char" + a);
				
				}

				public static void main(String[] args)
				{
				    new ConsOver();
				    new ConsOver(10);
				    new ConsOver('H');
				
				}



}