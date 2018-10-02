import java.util.Scanner;

public class TriangleClient {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int num1; 
        int num2;
        int num3;
        System.out.println("Enter three sides of the Triangle");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        
        TriangleHW typeTriangle = new TriangleHW(num1, num2, num3);
        
        System.out.println(typeTriangle + "The Triangle you typed: ");
			
        if(typeTriangle.isIsoscles()) {
        	System.out.println("It is Isocles");
        }
        else {
        	System.out.println("It is NOT Isocles");
        }
        if(typeTriangle.isEqualiter()) {
        	System.out.println("It is Equilateral");
        }
        else {
        	System.out.println("It is NOT Equilateral");
        }
        if(typeTriangle.isScalene()) {
        	System.out.println("It is Scalene");
        }
        else {
        	System.out.println("It is NOT Scalene");
        }
		}
	}
