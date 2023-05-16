package MethodOverloading1;

class AreaOfRectangle {
	public double areaOfrect(int x, int y) {
		return x * y;
	}

	public double areaOfrect(double x, int y) {
		return x * y;
	}

	public double areaOfrect(int x, double y) {
		return x * y;
	}

	public double areaOfrect(double x, double y) {
		return x * y;
	}
}
