Getting used to map inside map by means of matMultiplication:

scala> val mat1 = Array(Array(0.1, 0.2, 0.3), Array(0.5, 0.5, 0.5), Array(1.0, 1.5, 2.0))
mat1: Array[Array[Double]] = Array(Array(0.1, 0.2, 0.3), Array(0.5, 0.5, 0.5), Array(1.0, 1.5, 2.0))

scala> val mat2 = Array(Array(1.0, 1.0), Array(2.0, 2.5), Array(3.0, 3.5))
mat2: Array[Array[Double]] = Array(Array(1.0, 1.0), Array(2.0, 2.5), Array(3.0, 3.5))

scala> val dot = (a: Array[Double], b: Array[Double]) => (a zip b).map(i=> (i._1*i._2)).sum
dot: (Array[Double], Array[Double]) => Double = <function2>

scala> dot(Array(1.0, 1.0, 1.0), Array(2.0, 1.0, 3.0))
res1: Double = 6.0

scala> val transpMat2= mat2.transpose
transpMat2: Array[Array[Double]] = Array(Array(1.0, 2.0, 3.0), Array(1.0, 2.5, 3.5))

scala> mat1
res2: Array[Array[Double]] = Array(Array(0.1, 0.2, 0.3), Array(0.5, 0.5, 0.5), Array(1.0, 1.5, 2.0))

scala> transpMat2
res3: Array[Array[Double]] = Array(Array(1.0, 2.0, 3.0), Array(1.0, 2.5, 3.5))

scala> mat1.take(1)
res4: Array[Array[Double]] = Array(Array(0.1, 0.2, 0.3))

scala> val myMat1 = mat1.take(2)
myMat1: Array[Array[Double]] = Array(Array(0.1, 0.2, 0.3), Array(0.5, 0.5, 0.5))

scala> transpMat2
res5: Array[Array[Double]] = Array(Array(1.0, 2.0, 3.0), Array(1.0, 2.5, 3.5))

scala> myMat1.map(i => dot(i, transpMat2.map(j=> j))
     | )
<console>:13: error: type mismatch;
 found   : Array[Array[Double]]
 required: Array[Double]
              myMat1.map(i => dot(i, transpMat2.map(j=> j))
                                                   ^

scala> myMat1.map(i => (dot(i, transpMat2.map(j=> j))))
<console>:13: error: type mismatch;
 found   : Array[Array[Double]]
 required: Array[Double]
              myMat1.map(i => (dot(i, transpMat2.map(j=> j))))
                                                    ^

scala> myMat1.flatMap(i => (dot(i, transpMat2.map(j=> j))))
<console>:13: error: type mismatch;
 found   : Array[Array[Double]]
 required: Array[Double]
              myMat1.flatMap(i => (dot(i, transpMat2.map(j=> j))))
                                                        ^

scala> myMat1.map(i => (dot(i, Array(1.0, 1.0, 1.0)))
     | )
res9: Array[Double] = Array(0.6000000000000001, 1.5)

scala> myMat1
res10: Array[Array[Double]] = Array(Array(0.1, 0.2, 0.3), Array(0.5, 0.5, 0.5))

scala> myMat1.map(i => (dot(i, transpMat2(_)))
     | )
<console>:13: error: missing parameter type for expanded function ((x$1) => transpMat2(x$1))
              myMat1.map(i => (dot(i, transpMat2(_)))
                                                 ^

scala> myMat1.map(i => (dot(i, transpMat2.
apply   asInstanceOf   clone   isInstanceOf   length   toString   update

scala> myMat1.map(i => transpMat2.map(j => dot(j,i)))
res12: Array[Array[Double]] = Array(Array(1.4, 1.65), Array(3.0, 3.5))

scala> myMat1
res13: Array[Array[Double]] = Array(Array(0.1, 0.2, 0.3), Array(0.5, 0.5, 0.5))

scala> transpMat2
res14: Array[Array[Double]] = Array(Array(1.0, 2.0, 3.0), Array(1.0, 2.5, 3.5))

scala> def matrixMultipl2 (a: Array[Array[Double]], b: Array[Array[Double]]): Array[Array[Double]] = {
     | val tb = b.transpose
     | assert(tb(0).length == a(0).length, "Matrices cannot be multiplied")
     | val c = a.map(i => tb.map(j => dot(i,j)))
     | c
     | }
matrixMultipl2: (a: Array[Array[Double]], b: Array[Array[Double]])Array[Array[Double]]

scala> matrixMultipl2(myMat1, mat2)
res25: Array[Array[Double]] = Array(Array(1.4, 1.65), Array(3.0, 3.5))




Using map and indexWhere to filter, and nested map to alter each element of an nested array (instead of a for expression): 

scala> val index= Range(1, mat1.length); val mForFilter = mat1 zip index
index: scala.collection.immutable.Range = Range(1, 2)
mForFilter: Array[(Array[Double], Int)] = Array((Array(0.1, 0.2, 0.3),1), (Array(0.5, 0.5, 0.5),2))

scala> for (
     | i <- mForFilter
     | if i._1== Array(0.1, 0.2, 0.3)
     | ) println(i)

scala> for (
     | i<- mForFilter
     | if i._1== Array(0.1, 0.2, 0.3)
     | ) yield i._2
res10: Array[Int] = Array()

scala> mForFilter.map(i=> if (i._1== Array(0.1, 0.2, 0.3)) i._2)
res12: Array[AnyVal] = Array((), ())

scala> mForFilter(0)
res13: (Array[Double], Int) = (Array(0.1, 0.2, 0.3),1)

scala> res13._1
res14: Array[Double] = Array(0.1, 0.2, 0.3)

scala> val arr =  Array(0.1, 0.2, 0.3)
arr: Array[Double] = Array(0.1, 0.2, 0.3)

scala> arr == Array(0.1, 0.2, 0.3)
res15: Boolean = false

scala> arr(0) == 0.1
res16: Boolean = true

cala> arr.map(i => Array(0.1, 0.2, 0.3).map( j=> if (i==j) println ("TRUE")))
TRUE
TRUE
TRUE
res18: Array[Array[Unit]] = Array(Array((), (), ()), Array((), (), ()), Array((), (), ()))

scala> mForFilter.map(i => (i._1).map( g =>  Array(0.1, 0.2, 0.3).map( j => if (g==j)  i._2)))
res23: Array[Array[Array[AnyVal]]] = Array(Array(Array(1, (), ()), Array((), 1, ()), Array((), (), 1)), Array(Array((), (), ()), Array((), (), ()), Array((), (), ())))

scala>  mForFilter.map(i => (i._1).map( g =>  Array(0.1, 0.2, 0.3).forall( j => g==j )))
res16: Array[Array[Boolean]] = Array(Array(false, false, false), Array(false, false, false))

scala>  mForFilter.map(i => (i._1).map( g => g+1))
res18: Array[Array[Double]] = Array(Array(1.1, 1.2, 1.3), Array(1.5, 1.5, 1.5))

scala>  mForFilter.map(i => (i._1).map( g =>  Array(0.1, 0.2, 0.3).map( j => if (g==j) i._2 else 0)))
res24: Array[Array[Array[Int]]] = Array(Array(Array(1, 0, 0), Array(0, 1, 0), Array(0, 0, 1)), Array(Array(0, 0, 0), Array(0, 0, 0), Array(0, 0, 0)))

scala> res24.map(h => h(0).map(k => if (k != 0) k))
res28: Array[Array[AnyVal]] = Array(Array(1, (), ()), Array((), (), ()))

scala> mForFilter.map(i => (i._1)).map( g =>  (g(0)==0.1 && g(1) == 0.2 && g(2) == 0.3))
res54: Array[Boolean] = Array(true, false)

scala> mForFilter.map(i => (i._1)).indexWhere( g =>  (g(0)==0.1 && g(1) == 0.2 && g(2) == 0.3))
res60: Int = 0

ALTERNATIVE FOR FILTERING:

scala>  mForFilter.map(i => (i._1)).map( g => (g(0)==0.1 && g(1)==0.2 && g(2)==0.3)) 
res71: Array[Boolean] = Array(true, false)

scala>  mForFilter.map(i => (i._1)).map( g => (g(0)==0.1 && g(1)==0.2 && g(2)==0.3)).indexWhere(_ == true) 
res72: Int = 0

For altering nested arrays:

scala>  mForFilter.map(i => (i._1).map( g => g + i._2)) 
res76: Array[Array[Double]] = Array(Array(1.1, 1.2, 1.3), Array(2.5, 2.5, 2.5))

scala> mForFilter
res77: Array[(Array[Double], Int)] = Array((Array(0.1, 0.2, 0.3),1), (Array(0.5, 0.5, 0.5),2))

ALTERNATIVE FOR FILTERING using zip and map:

scala> Array(0.1, 0.2) == Array(0.1, 0.2)
res0: Boolean = false

scala> Array(0.1, 0.2).map(i =>  Array(0.1, 0.2).map(j => i == j))
res1: Array[Array[Boolean]] = Array(Array(true, false), Array(false, true))

scala> Array(0.1, 0.2) zip  Array(0.1, 0.2)
res3: Array[(Double, Double)] = Array((0.1,0.1), (0.2,0.2))

scala> res3.map(i => (i._1==i._2) )
res6: Array[Boolean] = Array(true, true)

scala> res3.indexWhere(i => (i._1==i._2)
     | )
res9: Int = 0

cala> res3.lastIndexWhere(i => (i._1==i._2)
     | )
res17: Int = 1

ok, so I don't have all results using indexWhere, only the first!

scala> res6 zipWithIndex
warning: there was one feature warning; re-run with -feature for details
res20: Array[(Boolean, Int)] = Array((true,0), (true,1))

scala> res20.map(i => if (i._1==true) i._2)
res22: Array[AnyVal] = Array(0, 1)

now I get the indices of all results.

