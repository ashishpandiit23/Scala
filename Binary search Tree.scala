import sun.misc.GC
import scala.util.control.Breaks
//import scala.reflect.internal.Trees.Return


class NodeTree
{
  var left:NodeTree=null
  var right:NodeTree=null
  var value:Int=0
  
  def this(x:Int)
  {
    this
    this.value=x
    this.left=null
    this.right=null
    
 }
  
}

object TreeTest {
  
  def insert(root:NodeTree,value:Int)=
  {
    
    var n:NodeTree=root
    var Nod=new NodeTree(value)
    if(root==null)
    {
      
     
      (Nod,Nod)
    }
    
    else
    {
      
      

      while(n!=null)
      {
        
        if(value>=root.value)
        {        
          //println("value="+value +"root value="+root.value)
          if(n.right==null)
          {
          n.right=Nod
         //println("n right="+n.right.value)
          n=n.right.right
                          }
          else
          {
            n=n.right
            }
        }
        
        else
        {
          
          if(n.left==null)
          {
          n.left=Nod
         // println("n left="+n.left.value)
          n=n.left.left
        
          }
          
          else
          {
            n=n.left
          }
        }
      }
    
      
    n=Nod
   // println("root="+root.value)
    (root,n)
  
    
    }
  }
  
  def display(root:NodeTree)
  {
    var n=root
    
    print("left tree="+"\t")
    while(n!=null)
    {
    print(n.value+"\t")
    n=n.left
    }
    
    n=root
    
    print("\n"+"right tree="+"\t")
    while(n!=null)
    {
      print(n.value+"\t")
    n=n.right
    }
  }
  
  def main(args:Array[String]):Unit={
 
    GC.currentLatencyTarget()
    var root:NodeTree=null
     root=insert(root,3)._1
 // println(root.value)
    root=insert(root,4)._1
    
     root=insert(root,2)._1
     root=insert(root,7)._1
     //println("root final="+root.value)
     root=insert(root,1)._1
     root=insert(root,11)._1
     root=insert(root,39)._1
     root=insert(root,-1)._1
     root=insert(root,-2)._1
   
     
  
  display(root)
    }
  
}
