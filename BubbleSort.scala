

object BubbleSort {
  
  def main(args:Array[String])
  {
    var x=Array(1,7,3,99,43,46,78,83,22)
    for(i<-0 to x.length-1;j<-0 to x.length-2)
    {
      if(x(j+1)<x(j))
      {
        var p=x(j+1)
        x(j+1)=x(j)
        x(j)=p
      }
    }
    
    x.foreach(println)
  }
}