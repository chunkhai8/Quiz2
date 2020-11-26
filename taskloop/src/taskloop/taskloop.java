package taskloop;

public class taskloop {

	public static void main(String[] args) {
		
		System.out.println("1.");
		int max = 5;
		for (int n = 1; n <= max; n++) {
		    System.out.println(n);
		}
		System.out.println();

		
		System.out.println("2.");
		int total = 25;
		for (int number = 1; number <= (total / 2); number++) {
		    total = total - number;
		    System.out.println(total + " " + number);
		}
		System.out.println();
		
		
		System.out.println("3.");
		for (int i = 1; i <= 2; i++) {
		    for (int j = 1; j <= 3; j++) {
		        for (int k = 1; k <= 4; k++) {
		            System.out.print("*");
		        }
		        System.out.print("!");
		    }
		    System.out.println();
		}
		System.out.println();
		
		System.out.println("4.");
		int number = 4;
		for (int count = 1; count <= number; count++) {
		    System.out.println(number);
		    number = number / 2;
		}
		System.out.println();
		
		System.out.println("While 1.");//while
		int a =1;
		while(a<=max) {
			System.out.println(a);
			a++;		
		}
		System.out.println();
		
		System.out.println("While 2:");
		int sum = 25;
		int b = 1;
		while(b <= ( sum / 2)) {
			sum = sum - b;
			System.out.println(sum + " " + b);
			b++;
		}
		System.out.println();
		
		System.out.println("While 3:");
		int c = 1;
		while(c<=2) {
			int d=1;
			while(d<=3) {
				int e=1;
				while(e<=4) {
					System.out.print("*");
					e++;
				}
			System.out.print("!");
			d++;
			}
			System.out.println();
		c++;
		}
		System.out.println();
		
		System.out.println("While 4:");
		int num = 4;
		int count=1;
		while(count<=num) {
			System.out.println(num);
		    num = num / 2;
			count++;

		}
	}
}
	
