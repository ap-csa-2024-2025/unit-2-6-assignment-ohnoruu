import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //Problem 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    double cirRadius = sc.nextDouble();
    Circle circle = new Circle(cirRadius);
    double circumference = circle.getCircumference();
    double cirArea = circle.getArea();
    System.out.println("A circle with a radius of " + cirRadius + " has a circumference of " + circumference + " and an area of " + cirArea);

    //Problem 2 
    System.out.println("Enter number of sides: ");
    int numSides = sc.nextInt();
    System.out.println("Enter the side length: ");
    double sidelength = sc.nextDouble();
    RegularPolygon poly1 = new RegularPolygon(numSides, sidelength);
    double poly1area = poly1.getArea();
    System.out.println("Area with " + numSides + " sides: " + poly1area + "\nIncrementing number of sides by two");
    RegularPolygon poly2 = new RegularPolygon(numSides + 2, sidelength);
    double poly2area = poly2.getArea();
    System.out.println("Area with " + (numSides + 2) + " sides: " + poly2area);
  }
}
