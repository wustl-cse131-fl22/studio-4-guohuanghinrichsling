package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		Color newColor = new Color(255, 192, 202);
		StdDraw.setPenColor(newColor);
		
		StdDraw.filledRectangle(0.25, 0.25, 0.25, 0.25);
		StdDraw.filledRectangle(0.75, 0.75, 0.25, 0.25);
		
		StdDraw.setPenColor(115, 215, 255);
		Font font = new Font ("Courier", Font.BOLD, 40);
		StdDraw.setFont(font);
		StdDraw.text(0.5, 0.5, "*BESTIE SHOOK*");
		
		
	}
}