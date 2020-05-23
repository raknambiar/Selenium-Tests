class A{
	int a,b;
	A(int m, int n){
		a = m;
		b = n;
	}
	void Display() {
		System.out.println("a and b are:"+a+" "+b);
	}
}
class B extends A{
	int c;
	B(int m, int n, int o){
		super(m,n);
		c= o;
	}
	void Display() {
		super.Display(); // Prints both displays. 
		System.out.println("c:"+c);
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(4,5,6);
		obj.Display();
	}
	

}
