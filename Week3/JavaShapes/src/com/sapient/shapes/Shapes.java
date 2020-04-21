package com.sapient.shapes;

public class Shapes {
	public static float calculateShapeArea(int numberOfSides, int sideLength) {
		switch (numberOfSides) {
		case 1:
			return Circle.calculateArea(sideLength);
		case 4:
			return Square.calculateArea(sideLength);
		case 3:
			return Triangle.calculateArea(sideLength);
		default:
			System.out.println("No Shapes Present");
			return 0;
		}
	}

	public static void main(String[] args) {
		calculateShapeArea(3, 12);
		calculateShapeArea(4, 15);
		calculateShapeArea(5, 15);
	}
}

class Circle {
	public static float calculateArea(int radius) {
		System.out.println("The Area of the circle is " + (float) 3.14 * radius * radius);
		return (float) (3.14 * radius * radius);
	}
}

class Square {
	public static float calculateArea(int sideLength) {
		System.out.println("The Area of the Square is " + sideLength * sideLength);
		return sideLength * sideLength;
	}
}

class Triangle {
	public static float calculateArea(int sideLength) {
		System.out.println("The Area of the Triangle is " + 0.433 * sideLength * sideLength);
		return (float) (0.433 * sideLength * sideLength);
	}
}