package day40_Exception;

public class RunnerCheckedException {
	
	

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
		
		
		String email="rasit@gmail.com";
		
		mailDogrula(email);

	}

	public static void mailDogrula(String email) throws InvalidEmailIdCheckedException {
		
		if (email.contains("@gmail.com") || email.contains("@hotmail.com") ) {
			System.out.println("mailiniz basar�yla kaydedildi");
		}else {
			throw new InvalidEmailIdCheckedException("email uygun degil");
		}
		
	}

	
	
}
