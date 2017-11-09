import com.github.fommil.netlib.LAPACK.{getInstance => lapack}
import org.netlib.util.intW._

val A : Array[Array[Double]] = Array(Array(3, 1, 0), Array(-1, 2, 2), Array(5, 0, -1))
val b : Array[Array[Double]] = Array(Array(6, -7, 10))

var info = new org.netlib.util.intW(0)
val ipiv  = 3
val nrhs = 1
val noArows = 3

