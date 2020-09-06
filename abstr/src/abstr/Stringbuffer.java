package abstr;

public class Stringbuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h="manhole";
		StringBuffer sb=new StringBuffer(h+"hello");
		sb.append("hai");
		System.out.println(sb);
		sb.insert(1, "kk");//at index 1 it starts adding kk
		System.out.println(sb);
		sb.replace(1, 3, "lll");
		System.out.println(sb);
		sb.delete(1,3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.substring(1, 5));
		String l=new String(sb);
		System.out.println(l);
		//l=l.replaceFirst("ah", "kla");
		System.out.println(l.replaceFirst("a", "kla"));
		System.out.println(l.indexOf('a', 10));
		System.out.println("kk"+l.indexOf('l',8));
		System.out.println(l.length());
		System.out.println(l.lastIndexOf("l"));
		System.out.println(l.lastIndexOf("l",10));
		String se=new String("hello");
		String see="hello";
		System.out.println(see==se.intern());//here when u use intern it gets mapped to hello in SCP
       
		
		//System.out.println("l.intern   "+l.intern());

	}

}
