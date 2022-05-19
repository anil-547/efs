package string_class_programs;

public class StringPrograms {
	
	public static void main(String[] args) {
		
		//creating string by using new
		String s1 = new String("pYthon");
		//creating string by using literals
		String s2="Python";
		String s3 = new String("Python");
		System.out.println(s1);
		System.out.println(s2);
		
		//comparing strings using equals()
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s1)); //in this method case is ignored
		
		//comparing string using ==
		System.out.println(s2==s3); //here we got false because strings are created using in ways
	
		//comparing strings using compareTo()
		System.out.println(s2.compareTo(s3)); //return 0 if true
		System.out.println(s1.compareTo(s1)); //returns +ve if grater else return -ve
		
		
		}

}
