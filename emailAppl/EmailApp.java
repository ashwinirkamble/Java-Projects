package emailAppl;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create object  of email class and call constructor
		Email em1=new Email("ashwini","k");
		em1.setMailboxCapacity(200);
		em1.setAlternateEmail("ashwinik695@yahoo.com");
		System.out.print(em1.getAlternateEmail());
		
		em1.showInfo();
		}
}
