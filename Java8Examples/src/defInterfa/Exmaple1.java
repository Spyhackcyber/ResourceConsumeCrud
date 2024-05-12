package defInterfa;

public class Exmaple1 implements Test{
	
	public void hello() {
		//Interfacename.super.defaulrMethodeName();
		Test.super. subtract();
	}
	
	
	public void subtract() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To access Static Methode Present in interface
		// InterfaceName.StaticMethodeName
		Test.add();
		
		Exmaple1 ex= new Exmaple1();
		ex.hello();

	}


	@Override
	public void ok() {
		// TODO Auto-generated method stub
		
	}

}
