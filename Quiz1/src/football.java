import java.util.Scanner;

public class football {
	public static void main(String[] args) {
		double TD, Yards, INT, comp, ATT, QB, a, b, c, d;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter total touchdowns: ");
		TD = in.nextDouble();

		System.out.println("Enter total yards: ");
		Yards = in.nextDouble();

		System.out.println("Enter total interceptions: ");
		INT = in.nextDouble();

		System.out.println("Enter total completitions: ");
		comp = in.nextDouble();

		System.out.println("Enter total passes attempted: ");
		ATT = in.nextDouble();

		a = ((comp / ATT) - 0.3) * 5;
		b = ((Yards / ATT) - 3) * 0.25;
		c = (TD / ATT) * 20;
		d = 2.375 - ((INT / ATT) * 25);

		QB = ((a + b + c + d) / 6) * 100;
		System.out.println(QB);
		
		in.close();
	}
}
