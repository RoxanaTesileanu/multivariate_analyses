import com.panayotis.gnuplot.JavaPlot
import scala.math._
import com.panayotis.gnuplot.plot.DataSetPlot
import com.panayotis.gnuplot.style.Style
import com.panayotis.gnuplot.style.PlotStyle


object UnifDistr {

def Unif (x:Double, a: Double, b:Double) : Double = if (x>= a & x<=b) 1/(b-a) else 0

val a = 3.0
val b = 7.0
var i = 0
val xs = Array.fill(10)({i +=1; i})

val data = xs.map( i => Unif(i, a, b) )
val data2 = xs.zip(data)
val data3 = data2.map( i => Array(i._1, i._2) )
val p = new JavaPlot
val ds = new DataSetPlot(data3)
val pstyle = ds.getPlotStyle

pstyle.setStyle(Style.POINTS)
p.getAxis("y").setBoundaries(0,1.0)
p.addPlot(ds)
p.setTitle("Continuous Uniform Probability Distribution")
p.setKey(JavaPlot.Key.OFF)
p.plot
}
