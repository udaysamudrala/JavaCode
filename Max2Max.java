
public class Max2Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int max = 0;
		int max2 = 0 ;

		for(int i = 0;i < 20;i++) {
			int x;
			x = (int)Math.floor(Math.random()* (85-10+1) ) + 10;
			System.out.println(x);

			if(x>max) {
				max2 = max ;
				max = x;
			}else {
				if(x >= max2 ) {
					max2 = x;
				}
			}
			
		}
		System.out.println("max = " + max);
		System.out.println("max2 = " + max2);
		
	}

}
