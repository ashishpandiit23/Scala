

object MergeSort {

	def main(args:Array[String])
	{

		var x=Array(1,8,4,2,20,15,19,11,39,25,27)

				// Array of Array of max size two

				def merge(x:Array[Int],l:Int,m:Int,r:Int)
		{
			var n1=Array.ofDim[Int](l-1)
					var n2=Array.ofDim[Int](r-m+1)

					for(i<-0 to n1.length-1)
					{
						n1(i)=x(l+i)
					}

			for(i<-0 to n2.length-1)
			{
				n2(i)=x(m+1+i)
			}

			var i,j=0;
			var k=1;

			while (i< n1.length-1 && j < n2.length-1) 
			{ 
				if (n1(i) <= n2(j)) 
				{ 
					x(k) = n1(i); 
					i=i+1
				} 
				else
				{ 
					x(k) =n2(j); 
					j=j+1
				} 
				k=k+1; 
			} 
			while (i < n1.length-1) 
			{ 
				x(k) = n1(i); 
				i=i+1
						k=k+1
			} 

			/* Copy remaining elements of n2[] if any */
			while (j < n2.length-1) 
			{ 
				x(k) = n2(j); 
				j=j+1 
						k=k+1
			} 

		}

		def sort(x:Array[Int],l:Int,r:Int)
		{
			if(l<r)
			{
				var m=(l+r)/2

						sort(x,l,m)
						sort(x,m+1,r)
						merge(x,l,m,r)

			}
		}

		sort(x,0,x.length-1)
		x.foreach(println)
	}
}