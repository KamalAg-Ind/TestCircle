import java.util.*;
public class Circle {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.print("Input the Radius.. ");
        int radiusOfCircle = in.nextInt(); 
        double Perimeter =  2 * 3.14 * radiusOfCircle;
        double Area = 3.14 * radiusOfCircle * radiusOfCircle;
        System.out.println("Perimeter is = " + (Perimeter));
        System.out.println("Area is = " + (Area));
	}

}

/*
 * For String pls use  in.nextLine()
 * For Integer pls use in.nextInt();
 * */

