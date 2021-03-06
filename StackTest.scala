import sun.misc.GC


class NodeStack
{
  var next:NodeStack=null
  var value:Int=0
  
  def this(x:Int)
  {
    this
    this.next=null
    this.value=x
  }
  
  def push(x:Int,y:NodeStack)
  {
    
  }
}

object StackTest {
  
  def push(top:NodeStack,y:Int,head:NodeStack)=
  {
    var p=top
    
    
    
    var z=new NodeStack(y)

      p.next=z
      p=z
     (p,head)
  }
  
  def pop(top:NodeStack,head:NodeStack)=
  {
    
    var x=head
    while(x.next!=top)
    {
      x=x.next
    }
    
    x.next=null
    (x,head)
  }
  
  def display(y:NodeStack)
  {
    var x=y
    
    while(x!=null)
    {
      println(x.value)
      x=x.next
    }
  }
  
  def main(args:Array[String])
  {
    GC.currentLatencyTarget()
    var head=new NodeStack(2)
    var top=head
   var x=(top,head)
    x=push(x._1,3,head)
    x=push(x._1,5,head)
    x=push(x._1,7,head)
    x=push(x._1,9,head)
    x=push(x._1,11,head)
    x=push(x._1,18,head)
    
    x=pop(x._1,x._2)
    x=pop(x._1,x._2)
    
    display(x._2)
    
    println("top="+x._1.value+"head="+x._2.value)
  }
  
}