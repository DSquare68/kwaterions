package com.daniel.kwaterions;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Graph extends Canvas{

	private Canvas c;
	private GraphicsContext gc;
	public Graph(Canvas c ) {
		gc =  c.getGraphicsContext2D();
		init();
	}
	private void init() {
		gc.setFill(Color.BLACK);
		gc.setLineWidth(3.0);
		gc.strokeLine(0.0,ReadOnly.Y*0.5,ReadOnly.X,ReadOnly.Y*0.5);
		gc.strokeLine(ReadOnly.X*0.5,0.0,ReadOnly.X*0.5,ReadOnly.Y);
	}
}
