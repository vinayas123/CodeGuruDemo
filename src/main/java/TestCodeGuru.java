
public class TestCodeGuru {

	public static void main(String[] args) {
		testLoopAndNull(50);
		testLoopAndNull(null);
		System.out.println("Success!");
	}
	
	static void testLoopAndNull(Integer count) {
		while(count > 0) {
			//do something
			String str = "Is it working ?";
			str = str + count;
		}
	}

}
