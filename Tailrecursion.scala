

object Tailrecursion {
  
  def main(args:Array[String])
  {
    
    def trec(x:Int,res:Int):Int={
      
      if(x==1) res
      
      else
        trec(x-1,res+x)  
        /*
  here no stack formation for the result as we are passing arg as res in method call itself
  so no stack overflow as in normal recursion program
         * 
         */
        
    }
    
    var c=trec(10,1)
    
    println(c)
  }
}