
public class schleifen {
	
	
	public static void schleife(int a,String s) {
		
		for(int i = 0 ; i <=a;i++) {
			System.out.println(s+i);
		}
		int i  = 1010;
		System.out.println(s+i);
	}
	
	public static void schleife1(int alter,String name) {
	
		System.out.println("Alter ist >> "+alter+" und name ist >> "+name);
		
	}
	
	public static String schleife2(int alter,String name) {
		

		return ""+alter;
		//return "Alter ist >> "+alter+" und name ist >> "+name;
		
	}
	
	
	

	
	public static void main(String[] args) {
		System.out.println(schleife2(20,"Diego"));
	}

}
