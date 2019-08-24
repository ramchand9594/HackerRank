
public class InnerClasses {

	public static void main(String[] args) {
		Dummy innerClasses = new InnerClasses().new Dummy();
		System.out.println(innerClasses.getString());
	}
	
	class Dummy {
		String s = "asdasdasd";
		int b;
		
		public String getString() {
			return s;
		}
	}
}
