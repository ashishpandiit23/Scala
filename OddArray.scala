/*
 * if the value at odd index is less than previous even index value then it will replace
 * 
 * 
 */


object OddArray {
  
  def main(args:Array[String])
  {
    
    var a=Array.ofDim[Int](10)
    for(i<-0 to a.length-1)
    {
      a(i)=Console.readInt()
    }
    
    for(i<-0 to a.length-1)
    {
      if(i%2!=0)
      {
        if(a(i)<a(i-1))
            {
        var x=a(i)
        a(i)=a(i-1)
        a(i-1)=x
            }
      }
    }
    
   
    a.foreach(println)
  }
}