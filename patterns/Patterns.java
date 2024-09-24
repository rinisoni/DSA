package patterns;

public class Patterns {
	
	public static void main(String[] args) {
		pattern1(5);
		System.out.println();
		pattern2(5);
		System.out.println();
		pattern3(5);
		System.out.println();
		pattern4(5);
		System.out.println();
		pattern5(5);
		System.out.println();
		pattern6(5);
		System.out.println();
		pattern7(5);
	}
	static void pattern1(int n) {
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern2(int n){
		for(int r=1;r<=5;r++) {
			for(int c=1;c<=n-r+1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern3(int n) {
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=n;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern4(int n) {
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=r;c++) {
				System.out.print(r);
			}
			System.out.println();
		}
	}
	static void pattern5(int n) {
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=r;c++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	static void pattern6(int n) {
		for(int r=1;r<=2*n-1;r++) {
			int totalColsInRow= r>n?2*n-r:r;
			for(int c=1;c<=totalColsInRow;c++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
	static void pattern7(int n) {
		
	}
	

}
