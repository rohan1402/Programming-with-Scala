package Inheritance

class Polygon {
  def area: Double = 0.0;
}

object Polygon {
  def main(args: Array[String]) {
    var poly = new Polygon;
    var rect = new Rectangle(20, 30);
    var tri = new Triangle(20, 30);
    printArea(rect);
    printArea(tri);
  }
  
  def printArea(p: Polygon) {
    println(p.area);
  }
}