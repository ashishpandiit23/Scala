//import scala.collection.parallel.ParIterableLike.Foreach

import scala.io.Source.stdin

object MaxProfit {
  
  def main(args:Array[String])
  {
    var x=Console.readLine()
    var y=x.split(" ").map(x=>x.toInt)
    var p= y.sortWith(_<_)
    var res=Array(List[Int]())
    var t=0
    for(i<-0 to p.length-2)
    {
      var l=List[Int]()
      l=l:+p(i)
      for(j<-i+1 to p.length-1)
      {
        if(p(j)%p(i)==0)
        {
          
          p(i)=p(j)
          l=l:+p(j)
        }
      }
      
      var m=l.reduce(_+_)
      
      if(t<m)
      {
        t=m
      }
    }
    
    println("max value="+t)
   
    
}
  
}