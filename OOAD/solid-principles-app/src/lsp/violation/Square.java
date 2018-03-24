package lsp.violation;

public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setWidth(int side) {
		this.height = width;
		this.width = width;
	}

	@Override
	public void setHeight(int side) {
		this.height = side;
		this.width = side;
	}
}
