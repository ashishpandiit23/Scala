

object RotateArray {
  
  def main(args:Array[String])
  {
    
    
    
    println("enter the size of array")
    val x=Console.readInt()
    val y=Console.readInt()
    var a=Array.ofDim[Int](x,y)
    
   // a=Array(Array(1,2,3,19),Array(4,5,6,20),Array(7,8,9,18),Array(10,11,12,13))
    
    for(i<-0 to x-1;j<-0 to x-1)
    {
      a(i)(j)=Console.readInt()
    }
    
    
    if(x!=y)
    {
      println("not a sqaure array")
    }
    
    else
    {
      for(j<-0 to x-1;i<-x-1 to 0 by -1)
      {
        println(a(i)(j))
      }
    }
  }
}