package LazyEvaluation

class strict{
  val e = {
    println("strict");
    9
  }
}

class lazyEval{
  lazy val l = {
    println("lazy");
    9
  }
}

object Demo {
  def main(args: Array[String]){
    val x = new strict;
    val y = new lazyEval;
  }
}