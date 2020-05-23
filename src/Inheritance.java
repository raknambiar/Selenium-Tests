class x{
	x(){
		System.out.println("class x constructor");
	}
}
class y extends x{
	y(){
		System.out.println("class y constructor");
	}
}
class z extends y{
	z(){
		System.out.println("class z constructor");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		z obj =  new z();

	}

}
