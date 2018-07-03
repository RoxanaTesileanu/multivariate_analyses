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


