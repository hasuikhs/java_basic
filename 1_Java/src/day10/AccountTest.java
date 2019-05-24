package day10;

public class AccountTest {
	public static void main(String[] args) {
		Account a1;
		try {
			a1 = new Account("001",900);
			System.out.println(a1);
		} catch (MoneyException e) {
			System.out.println("a1 " + e.getMessage());
		}
		
		
		Account a2;
		try {
			a2 = new Account("002",-7000);
			System.out.println(a2);
		} catch (MoneyException e) {
			System.out.println("a2 "+ e.getMessage());
		}
		

		
	}
}
