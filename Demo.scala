//problem 1

/*1. Write a function to receive string and return it as Json string. 
You can use constant header(key) value for json key. Write test cases to prove function is working as expected. 

Input 
Ganit, Shiva, Welcome to the team Google, Sundar, Welcome to the search 
Output: (for first input) { 
Company: Ganit CEO: Shiva Greetings: Welcome to the team } Note: Do not use for loop to convey from csv string to json string. 

*/

import scala.util.parsing.json.JSONObject


object Demo {
  
  // defining case class according to the schema of the data
  case class Emp(cname:String,designation:String,Greeting:String,name:String)
  
  def main(args:Array[String])
  {
    
    // sample input String data
  val data=("Accenture,CEO,welcome to Accenture,Ashish")
  
  // split the data into Array of String
  val splitdata=data.split(",")
  
  // provide the schema to your data using case class
  var finaldata=Emp(splitdata(0),splitdata(1),splitdata(2),splitdata(3))
  
  // converting the case class object to key value pair or into MAP object
  var x=Map("cname"->finaldata.cname,"designation"->finaldata.designation,"Greeting"->finaldata.Greeting,"name"->finaldata.name)
  
 //parsing the map into JSON object
  var jsondata= scala.util.parsing.json.JSONObject(x)
 
 println(jsondata)
  
 }
}
