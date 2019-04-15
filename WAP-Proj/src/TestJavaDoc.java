import java.util.HashMap;

public class TestJavaDoc {

	int x;
	//HashMap<K, V>NavigableSet
	public static void main(String[] args) {
		
		TestJavaDoc doc = null;
		if(doc != null & doc.x>0){
			
		}
		
		int x = 25;
        if(x < 50 && x > 0) {
            System.out.println("OK");
        }

        if(x < 50 & x > 0) {
            System.out.println("Yup");
        }
	}
}
