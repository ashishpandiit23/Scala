// problem 2
/*
2. Write a function to receive string and return a string. 
String should be manipulated as first character and last character combination till the length/2
Input: 
123456 Output: 162534 
Input: 
12345 Output: 
15243 
*/


object Test2 {
  
  def input(x:String):String={
    var p=x.toArray
    
    var l=x.length()/2
    var n=x.length()
    
    var a=new Array[Char](p.length())
    var j=0
    
    
   
    for(i<-0 to n-1)
    {
     
      if(i%2==0)
      {
        
      a(i)=p(j)
      
      j=j+1
      
      }
      }
    
  //a.foreach(println)
   
     j=n-1
    for(i<-0 to n-1 )
    {
      
     //println("j="+j)
      if(i%2!=0)
      {
        a(i)=p(j)
        j=j-1
      }
      
    }
    
     //a.foreach(println)
    var b=a.mkString
  
  b
  
  }
  
  def main(args:Array[String])
  {
    
    var x=input("123456")
    var y=input("12345")
    
   println(x)
   println(y)
    
  }
}
