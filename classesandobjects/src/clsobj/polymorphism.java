package clsobj;

public class polymorphism {
	public void add()
	{
		System.out.println("null parameters");
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(double c,double d)
	{
		double e=c+d;
		System.out.println(e);
	}
	public void add(String a1,String b1)
	{
		String f=a1+b1;
		System.out.println(f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism p=new polymorphism();
		p.add();
		p.add(10,50);
		p.add(21.0009,67.009);
		p.add("greeshma","high school");

	}

}
