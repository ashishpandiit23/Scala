// first repeating character using hashing
/*
 
 O(n) traverse the array(n) and store its element in Array[List] of size 256
 and then check the first repeted character on the basis of the size of list
 
 */

import java.util.regex.ASCII
import com.sun.jmx.snmp.IPAcl.ASCII_CharStream
import scala.util.control.Breaks._


object FirstRepeatchar {
 
  
  def hash(x:Char):Int={
    
   var p=x.toInt
    
   p
  }
  def main(args:Array[String])
  {
    println("Enter the String")
    var x=Console.readLine()
   var a=x.toArray
    // Generate the hash function to designate different index value for the diff character
   
   var d=new Array[List[Any]](256)
   var c=new Array[List[Any]](256)
   
  var b= Array.fill(256)(List(0))
//println(b.length)
   for(i<-0 to a.length-1)
   {

     var j=hash(a(i))

     b(j)=b(j):+j
     
   }
    
    // breakable section is used if we are using break statement in this section, it will not throw exception when break condition occurs
 breakable{   for(i<-0 to a.length-1)
   {
     
      var k=hash(a(i))
      if(b(k).length>=3)
      {
        println("first repeated char="+a(i))
        try{
        break
        }
        catch
        {
          case ex:Exception=>" got the answer"
        }
      }
    
   }
     
   }
    
  }
}