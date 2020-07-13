package lsp;

public class Main {

  /**
   * Run a demo.
   * @param args The usual.
   */
  public static void main(String[] args) {
    Rectangle rectangle = getRectangle();
    System.out.println("Got a Rectangle from somehwere.");
    System.out.println("Setting height to 10...");
    rectangle.setHeight(10);
    System.out.println("Setting width to 50...");
    rectangle.setWidth(50);
    System.out.println(String.format("The new area is: %s.", rectangle.area()));
    System.out.println("Huh?! It's not a rectangle?");
  }

  /*
   * The idea here is you get Rectangle objects from 
   * somewhere, you don't necessarily know how they 
   * are made.
   */
  static Rectangle getRectangle() {
    return new Square();
  }
}
