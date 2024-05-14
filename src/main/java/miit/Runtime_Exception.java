package miit;

public class Runtime_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = 10 / 2;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println("it will always execute");
		}

		try {
			String s = null;
			int length = s.length();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		System.out.println("exception is not handeled");

	}

}
