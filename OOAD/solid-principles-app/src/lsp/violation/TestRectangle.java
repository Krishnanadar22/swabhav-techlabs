package lsp.violation;

public class TestRectangle {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(10, 20);
		Square s = new Square(20);

		shouldNotChangeWidthIfHeightChanges(r);
		shouldNotChangeWidthIfHeightChanges(s);
	}

	public static void shouldNotChangeWidthIfHeightChanges(Rectangle r) {
		int before = r.getWidth();
		r.setHeight(35);
		int after = r.getWidth();
		System.out.println("Before changing Height:" + before);
		System.out.println("After changing Height:" + after);

	}
}
