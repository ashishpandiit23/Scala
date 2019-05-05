

object Swapvariable {
  
  def main(args:Array[String])
  {
    
    var a,b=1
    
    a=20
    b=30
    
    a=a+b
    b=a-b
    a=a-b
    
    println("a="+a)
    println("b="+b)   
  }
}