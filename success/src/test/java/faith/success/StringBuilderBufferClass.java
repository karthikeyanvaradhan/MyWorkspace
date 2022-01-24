package faith.success;

/*String Variables are mutable i.e The value can be changed*/ 


public class StringBuilderBufferClass {

	public static void main(String[] args) {

String name = "Aashish";
		StringBuffer stbuffer = new StringBuffer("Karthikeyan");
		//StringBuffer reverse = stbuffer.reverse();
		//System.out.println(reverse);
		
		stbuffer.insert(0, 'V');
		System.out.print("\n");
		System.out.println();
		stbuffer.append("Varadhan");
		System.out.println(stbuffer);
		
		stbuffer.append("\n");
		StringBuffer revString = stbuffer.append(name);
		System.out.println(revString.reverse());
	}

}
