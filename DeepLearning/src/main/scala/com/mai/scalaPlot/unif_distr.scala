import com.panayotis.gnuplot.JavaPlot
import scala.math._
import com.panayotis.gnuplot.plot.DataSetPlot

object UnifDistr {

def Unif (x:Double, a: Double, b:Double) : Double = if (x>= a & x<=b) 1/(b-a) else 0

val a = 3.0
val b = 7.0
var i = 0
val xs = Array.fill(10)({i +=1; i})

val data = xs.map( i => Unif(i, a, b) )

val p = new JavaPlot

}
