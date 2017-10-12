import java.util.Scanner;

public class TotalTrianglesInPascalTriangle {

	public static void main(String[] args) {
		int level;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of pascal triangle levels");
		level = sc.nextInt();
	//	for (level = 0; level <=triangles; level++) {
			int  base = 2, inc = 1, val, total = 0;
			total = (int) Math.pow(level, 2);
			while (base <= level) {
				val = fact(level - inc);
				if (level >= base * 2) {
					// for revese triangles
					val = val + fact(level - base - inc);
				}
				System.out.println("For Level "+base+" no of triangles "+val);
				inc++;base++;total = total + val;
			}
			System.out.println("For " +level+" levels No of triangles : " + total);
		//}
	}

	static int fact(int x) {
		int sum = 0;
		while (x != 0) {
			sum = sum + x;
			x--;
		}
		return sum;
	}
}
