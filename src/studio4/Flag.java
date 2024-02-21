package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setPenColor(47, 147, 247);
		StdDraw.setPenRadius(0.09);
		StdDraw.circle(0.5, 0.5, 0.1);
		
		StdDraw.setPenColor(50, 70, 80);
		StdDraw.filledRectangle(0.5, 0.3, 0.5, 0.2);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5, 0.1, 0.5, 0.1);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5, 0.9, 0.5, 0.1);
	}
}