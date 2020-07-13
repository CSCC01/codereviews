package lsp;

public class Square extends Rectangle {


	/**
	 * Creates a new Square with the zero width.
	 */
	public Square() {}

	/**
	 * Creates a new Square with the given width.
	 * @param width the width of the new Square
	 */
	public Square(double width) {
		this.width = width;
		this.height = width;
	}

	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		this.height = width;
	}

	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		this.width = height;
	}
}
