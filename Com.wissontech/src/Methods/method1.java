package Methods;

public class method1 {
	public void kiran(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void gedda(String str1, String str2) {
		String str3 = str1 + str2;
		System.out.println(str3);	
	}
	public String nari(String s,String c,String s1) {
		String result= s+c+s1;
		 return result;
	}
	public float rao(float f1,float f2) {
		float f3=f1+f2;
		return f3;
		
	}
	

	public static void main(String[] args) {
		method1 s = new method1();
		s.kiran(10, 20);
		s.gedda("saikiran", "gedda");
		String result=s.nari("gedda","peta ","rockstar");
		System.out.println(result);
		float f3=s.rao(1.00f, 2.0f);
		System.out.println(f3);
	
}
}
