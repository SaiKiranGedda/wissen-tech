package Methods;

public class methods {
public void sai() {
	for(int i=0;i<=10;i++) {
		if(i%2==0) {
			System.out.println("even numbers"+i);
		}else {
			System.out.println("odd number"+i);
		}
	}
}
	public static void main(String[] args) {
		methods s=new methods();
		s.sai();
	}

}
