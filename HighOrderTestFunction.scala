

object HighOrderTestFunction {
  
  def add(x:Int,y:Int):Int={
    x+y
  }
  
  def sub(a:Int,b:Int)=a-b
  
  def mul(a:Int,b:Int)=a*b
  
  def div(a:Int,b:Int)=a/b
    def test(f:(Int,Int)=>Int,a:Int,b:Int):Int=f(a,b)
 
def main(args:Array[String])
    {
      
     var x= test(add,1,2)
     
     println(test(sub,4,5))
     
     println(test(mul,4,5))
     
     println(test(div,4,5))
         
     println("x="+x)
    }
  
}