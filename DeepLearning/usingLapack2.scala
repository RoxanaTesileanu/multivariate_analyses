import org.netlib.lapack
import org.netlib.util.intW._

object UsingLapack2{

val noArows = 3
val nrhs = 1
val matrixA : Array[Array[Double]] = Array(Array(3, 1, 0), Array(-1, 2, 2), Array(5, 0, -1))
val aoffset = 0
val lda = 3
val ipiv : Array[Int] = Array(0,0,0)
val ipivoffset = 0
var b  : Array[Array[Double]] = Array(Array(6, -7, 10))
val boffset = 0
val ldb= 3
var info = new org.netlib.util.intW(0)
}
