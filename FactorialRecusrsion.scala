

object FactorialRecusrsion {
  
  var res:Int=1
  
    def fact(x:Int):Int={
    if(x==1) res*1
    
    else
    {
      
    
      res=x*res
     
      fact(x-1:Int)
      
    }
    }
  def main(args:Array[String])
  {
    
    var t=fact(6)
    
    println("p="+t)
  }
}