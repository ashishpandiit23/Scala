

object Optiontest {
  
  def main(args:Array[String])
  {
    
    def demo(x:String):Option[String]={
      Option(x)
    }
    
    var s=demo("helol")
    var p=s match {
  case Some(s)=>println(s"$s") // to fetch string out of Option[String]
  case None => println("none")
  }
  }
  
  
}