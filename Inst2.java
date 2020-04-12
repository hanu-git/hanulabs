class Inst2
{

Inst2()
{
				System.out.println("0-args method");
}

Inst2(int a)
{
				System.out.println("2-args method");
}

Inst2(int x, int y)
{
				System.out.println("3-args method");
}

{
				System.out.println("Instance Block");
}


public static void main(String[] args)
{

new Inst2();
new Inst2(10);
new Inst2(100,200);

}

}