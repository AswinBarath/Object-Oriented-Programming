
public class CircleParams {

	public static void main(String[] args) {
		int r = 5, d;
		float PI = 3.14159f, circum, area;
		d = 2 * r;
		circum = 2 * PI * r;
		area = PI * r * r;
		System.out.println("given radius= " + r);
		System.out.println("calculated diameter= " + d);
		System.out.println("calculated circumference= " + circum);
		System.out.println("calculated area= " + area);
	}

}
