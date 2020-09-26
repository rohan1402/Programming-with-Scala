package Inheritance

class Triangle (length: Double, width: Double) extends Polygon {
  override def area = length*width/2;
}