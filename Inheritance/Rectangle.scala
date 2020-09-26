package Inheritance

class Rectangle(length: Double, width: Double) extends Polygon {
  override def area = length*width;
}