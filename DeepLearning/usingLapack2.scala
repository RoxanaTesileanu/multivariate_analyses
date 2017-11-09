import org.netlib.lapack
import org.netlib.util.intW._

object UsingLapack2{

val noArows = 3
val nrhs = 1
val matrixA : Array[Array[Double]] = Array(Array(3, 1, 0), Array(-1, 2, 2), Array(5, 0, -1))
var aoffset = 0
val lda = 3
var ipiv : Array[Int] = Array(3,3,3)
var ipivoffset = 0
var b  : Array[Double] = Array(6, -7, 10)
var boffset = 0
val ldb= 3
var info = new org.netlib.util.intW(0)
lapack.Dgesv.dgesv(noArows, nrhs, matrixA.flatten, aoffset, lda, ipiv, ipivoffset, b, boffset, ldb, info)
println(b, ipiv)
}
