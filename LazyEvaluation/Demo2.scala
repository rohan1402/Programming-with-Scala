package LazyEvaluation

object Demo2 {
  def method1(n: Int){
     println("Method 1");
     println(n+"\n");
  }
  
  def method2(n: ⇒ Int){
     println("Method 2");
     println(n+"\n");
  }
  
  def main(args: Array[String]){
    val add = (a: Int, b: Int) ⇒ {
      println("Add");
      a+b;
    }
    
    method1(add(5,6));
    method2(add(5,6)); // first the mthod will be called.
                       // when n is called, only then value is assigned. 
  }
}