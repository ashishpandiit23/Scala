import org.omg.CORBA.FREE_MEM
import sun.misc.GC


class NodeList
{
  var value:Int=0
  var next:NodeList=null
  
  
  def push(x:Int,y:NodeList):NodeList=
  {
    this
    var z=new NodeList(x)
    z.next=y
    return z
    
  }
  
  def this(n:Int)
  {
    this
    this.value=n
    this.next=null
  }
}

object ListTest {
  
  def display(p:NodeList)
  {
    if(p==null)
    {
      return
    }
    
    else {
      
      var t=p
     // println("t value="+t.value)
      while(t!=null)
      {
        println(t.value)
        
        if(t.next!=null)
        {
          t=t.next
        }
        
        else
        {
          return
        }
        
      }
    }
  }
  
  def push(x:Int,p:Int,z:NodeList):NodeList=
  {
    var y=z
    var t=y
    while(y!=null)
    {
      if(y.value!=x)
      {
        y=y.next
      }
      
      else
      {
        var n=y.next
        y.next=new NodeList(p)
        y.next.next=n
        return t
      }
    }
    
    return t
  }
  
  def deleteNode(x:Int,p:NodeList):NodeList={
    
    var t=p
    var y=t
    
    while(y!=null)
    {
    
    if(y.next.value!=x)
    {
      y=y.next
    }
    
    else
    {
      y.next=y.next.next
      return t
    }
  }
    
    return t
  }
  
  def main(args:Array[String])
  {
    GC.currentLatencyTarget()
    
    var root=new NodeList(1)
    
    root.next=new NodeList(2)
    root.next.next=new NodeList(3)
    root.next.next.next=new NodeList(5)
    root.next.next.next.next=new NodeList(4)
    
   root= new NodeList().push(7,root)
   root=push(3,9,root)
   
   root=deleteNode(5,root)
    
    display(root)
    
  }
}
