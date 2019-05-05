

object Curryingtest {

	def main(args:Array[String])
	{

		/* currying first way -- breaking the function which takes two input paramater
   into a function which takes single input parameter
		 */

		def test(x:Int)=
			{
					y:Int=>x+y
			}

		// currying second way
		def test2(x:Int)(y:Int)=x+y

				//currying third way
				def test3(x:Int,y:Int)=x+y


				var p=test(2)
				var q=p(3)

				var u=test2(3)_
				var v=u(8)

				println(v)

				println(q)
	}
}