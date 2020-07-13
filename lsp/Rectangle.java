package lsp;

public class Rectangle {

  protected double width; // width of this Rectangle
  protected double height; // height of this Rectangle
  
  /**
   * Creates a new Rectangle with 0 width and height.
   */
  public Rectangle() {}
  
  /**
   * Creates a new Rectangle with the given width and height.
   * @param width width of the new Rectangle
   * @param height height of the new Rectangle
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the width of this Rectangle.
   * @return the width of this Rectangle
   */
  public double getWidth() {
    return width;
  }
  
  /**
   * Sets the width of this Rectangle to width.
   * @param width the new width of this Rectangle
   */
  public void setWidth(double width) {
    this.width = width;
  }
  
  /**
   * Returns the height of this Rectangle.
   * @return the height of this Rectangle
   */
  public double getHeight() {
    return height;
  }
  
  /**
   * Sets the height of this Rectangle to height.
   * @param height the new height of this Rectangle
   */
  public void setHeight(double height) {
    this.height = height;
  }
  
  /** 
   * Returns the area of this Rectangle.
   * @return the area of this Rectangle
   */
  public double area() {
    return width * height;
  }
}
