package com.cleri5;

import java.util.ArrayList;
import java.util.List;

class Axis {
	int x = 0;
	int y = 0;

	Axis(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "( " + x + ", " + y + " )";
	}
}

public class ShortestPathProblemSGrid {

	public static void main(String[] args) {
		int a = 2, b = 0;
		int p = 1, q = 3;
		System.out.println(shortestPath(a, b, p, q));
	}

	private static List<Axis> shortestPath(int a, int b, int p, int q) {
		List<Axis> res = new ArrayList<>();
		int dis1 = p - a;
		int a1 = a;
		if (dis1 > 0) {
			for (; a1 <= p; a1++) {
				res.add(new Axis(a1, b));
				a = a1;
			}
		} else if (dis1 < 0) {
			for (; a1 >= p; a1--) {
				res.add(new Axis(a1, b));
				a = a1;
			}
		}

		int dis2 = q - b;
		int b1 = b;
		if (dis2 > 0) {
			for (b1 = b1 + 1; b1 <= q; b1++) {
				res.add(new Axis(a, b1));
			}
		} else if (dis2 < 0) {
			for (b1 = b1 - 1; b1 >= q; b1--) {
				res.add(new Axis(a, b1));
			}
		}
		return res;
	}

}
