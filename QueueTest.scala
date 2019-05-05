import sun.misc.GC


class NodeQueue
{
  
  var next:NodeQueue=null
  var value:Int=0
  
  def this(x:Int)
  {
    this
    this.next=null
    this.value=x
    
  }
  
}

object QueueTest {
  
  def insert(x:Int,top:NodeQueue,head:NodeQueue)=
  {
    
    
    var t=top
    var z=new NodeQueue(x)
    t.next=z
    t=z
    
    (head,t)
  }
  
  def delete(head:NodeQueue,top:NodeQueue)=
  {
    var n=head
    n=head.next
    
    (n,top)
  }
  
  def display(head:NodeQueue)
  {
    var x=head
    
    while(x!=null)
    {
      println(x.value)
      x=x.next
    }
  }
  
  def main(args:Array[String])={
 // var head:NodeQueue=null
 // var top:NodeQueue=null
    GC.currentLatencyTarget()
 var head=new NodeQueue(2)
  var top=head
  var x=(head,top)
  x=insert(2,x._2,x._1)
  x=insert(3,x._2,x._1)
  x=insert(4,x._2,x._1)
  x=insert(5,x._2,x._1)
  x=delete(x._1,x._2)
  x=delete(x._1,x._2)
  x=delete(x._1,x._2)
  //println("head="+x._1.value+"top="+x._2.value)
  display(x._1)
  
  }
}