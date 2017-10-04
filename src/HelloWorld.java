import java.io.IOException;




public class HelloWorld {
	private static String messageGlobal= "my name is Kenneth aka dickbutt";
	
	public static void main(String[] args){
		
		String local = "I can only be accessed from this method";
		
		System.out.println("Hello World I love you so fucking much you whore");

		System.out.println(messageGlobal);
		
		System.out.println(local);
		
		createMessage3();
		
		System.out.println(createMessage());
		
		System.out.println(createMessage2("doing this to make hazel smile, I love her"));
		
		createMessage3();
		
		System.out.println(createMessage2("hazel"));
		
		Noob solution = new Noob();
		solution.compare();
		
		int x = 1;
		while (x < 3) {
			System.out.print("Doo");
			System.out.print("Bee");
		x = x + 1;
		}
		if (x == 3) {
			System.out.print("Do");
		}
		
		
		
		/*try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}*/
	}
	
	
	private static String createMessage() {
		String local = "We are just creating a message";
		return local;
		
	}
	
	private static String createMessage2(String input) {
				return input;
	
	}

	private static void createMessage3() {
		System.out.println(messageGlobal);
		
		
	}
	
	
	
}
