/* 
This source file represents an implementation example of the LAPACK subroutine dgesv in Scala.  
@author: Roxana Tesileanu, INCDS BV, roxana.te@web.de
References:
K. Seymour - LAPACK F2J Javadoc
M. Odersky - Programming in Scala
M. Lewis - Introduction into Programming and Problem Solvin in Scala
Nag Ltd. - NAG Fortran Library Document F07AAF (DGESV)
*/

import org.netlib.lapack
import org.netlib.util.intW._

object UsingLapack2{

val noArows = 3
val nrhs = 1
val matrixA : Array[Array[Double]] = Array(Array(3, 1, 0), Array(-1, 2, 2), Array(5, 0, -1))
var aoffset = 0
val lda = 3
var ipiv : Array[Int] = Array.fill(noArows)(0)
var ipivoffset = 0
var b  : Array[Double] = Array(6, -7, 10)
var boffset = 0
val ldb= 3
var info = new org.netlib.util.intW(0)
lapack.Dgesv.dgesv(noArows, nrhs, (matrixA.transpose).flatten, aoffset, lda, ipiv, ipivoffset, b, boffset, ldb, info)
val result = (b, ipiv)
for (i<- result._1) println (i)
for (i<- result._2) println (i)
}

