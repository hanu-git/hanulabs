class Inst3
{

Inst3()
{
    this(10);
				System.out.println("0-args method");
}

Inst3(int a)
{
				this(100,200);
				System.out.println("2-args method"+"A="+a);
}

Inst3(int x, int y)
{
				System.out.println("3-args method"+"X="+x+"y="+y+"X+Y"+(x+y));
}

{
				System.out.println("Instance Block");
}


public static void main(String[] args)
{

new Inst3();
//new Inst2(10);
//new Inst2(100,200);

}

}