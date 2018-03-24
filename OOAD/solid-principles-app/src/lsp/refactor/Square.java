package lsp.refactor;

public class Square implements IPolygon {

	private int side;

	public Square(int side) {
		this.side = side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getWidth() {
		return side;
	}

	public int getHeight() {
		return side;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side * side;
	}
}
