package lsp;

public class Main {

  /**
   * Run a demo.
   * @param args The ususal.
   */
  public static void main(String[] args) {
    Rectangle r = getRectangle();
    r.setHeight(10);
    r.setWidth(50);
    System.out.println(r.area()); // it's not a rectangle!
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
