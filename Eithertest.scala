
/*
 
 Either Keyword is similar to Option in scala
 it will either return left or Right value 
 
 see below example
 */

object Eithertest {
  
  def main(args:Array[String])
  {
    def test(x:Int,y:String):Either[Int,String]={
      
      Right(y)  // Left(x)
    }
    
   var v=test(2,"Ashish")
   
   println(s"$v")
  }
  
  
}