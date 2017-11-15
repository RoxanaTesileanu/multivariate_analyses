import com.panayotis.gnuplot.JavaPlot
import scala.math._

object GaussDistr{

def Gauss (x: Double, mu:Double, sigma:Double) = 1.0/(sigma*sqrt(2*Pi))*exp( -pow((x-mu),2) / 2/pow((2*sigma),2))

val mu = 50
val sigma = 100
var i = 0
val xs = Array.fill(100)({i +=1; i})
}
