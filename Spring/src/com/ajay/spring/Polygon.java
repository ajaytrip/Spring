package com.ajay.spring;

import java.util.List;

public class Polygon {
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	void draw(){
		for(Point itr: points){
			System.out.println("point :" + itr.getX() + " " + itr.getY());
		}
	}

}
