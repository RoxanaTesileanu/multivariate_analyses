import com.panayotis.gnuplot.JavaPlot
import com.panayotis.gnuplot.style.Style \\ HISTOGRAM
import com.panayotis.gnuplot.plot.DataSetPlot
import scala.math._
import com.mai.scalaML._
import TreeProb._


object HistTreeProb {

val classes = Array(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0)
val data = classes.zip(probCounts)
val data2 = data.map( i => Array(i._1, i._2) )
val ds = new DataSetPlot(data2)
val p = new JavaPlot
val sty = ds.getPlotStyle
sty.setStyle(Style.HISTOGRAMS)
p.addPlot(ds)
p.plot
}

