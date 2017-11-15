import com.panayotis.gnuplot.JavaPlot
import com.panayotis.gnuplot.style.Style // HISTOGRAM
import com.panayotis.gnuplot.style.PlotStyle
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
val pstyle = ds.GetPlotStyle
pstyle.setStyle(Style.HISTOGRAMS)
pstyle.setStyle(Style.HISTEPS)
pstyle.setStyle(Style.BOXES)
p.addPlot(ds)
p.plot
}


/*
object HistTreeProb {

val classes = Array(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0)
val data = classes.zip(probCounts)
val data2 = data.map( i => Array(i._1, i._2) )
val ds = new DataSetPlot(data2)
val p = new JavaPlot
val histSty = new com.panayotis.gnuplot.style.PlotStyle
histSty.setStyle(Style.HISTOGRAMS)
histSty.setStyle(Style.HISTEPS)
ds.setPlotStyle(histSty)
p.addPlot(ds)
p.plot
}

*/
