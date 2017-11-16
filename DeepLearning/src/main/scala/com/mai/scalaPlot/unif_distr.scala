/* 
Script example for drawing a uniform probability density function with JavaPlot in Scala.
Author: Roxana Tesileanu, INCDS BV, roxana.te@web.de
References:
Simom Jackman, "Bayesian Data Analysis for Social Sciences"
Margaret L. Lial, Raymond N. Greenwell, Nathan P. Ritchey, "Calculus with Applications", 10th ed., 2012, Pearson
Philipp K. Janert, "Gnuplot in Action", 2010, Manning
Panayotis Katsaloulis, "JavaPlot" , http://javaplot.panayotis.com/, 2017
Mark C. Lewis, "Introduction into Programming and Problem Solving using Scala", 2017, CRC
EPFL, Scala Standard Library, 2017
*/

import com.panayotis.gnuplot.JavaPlot
import scala.math._
import com.panayotis.gnuplot.plot.DataSetPlot
import com.panayotis.gnuplot.style.Style
import com.panayotis.gnuplot.style.PlotStyle


object UnifDistr {

def Unif (x:Double, a: Double, b:Double) : Double = if (x>= a & x<=b) 1/(b-a) else 0

val a = 3.0
val b = 7.0
var i = 0.0
val fillno = 10.0/0.01
val xs = Array.fill(fillno.toInt)({i +=0.01; i})
val data = xs.map( i => Unif(i, a, b) )
val data2 = xs.zip(data)
val data3 = data2.map( i => Array(i._1, i._2) )
val p = new JavaPlot
val ds = new DataSetPlot(data3)
val pstyle = ds.getPlotStyle

pstyle.setStyle(Style.FILLEDCURVES)
p.getAxis("y").setBoundaries(0,1.0)
p.getAxis("x").setBoundaries(0,10)
p.addPlot(ds)
p.setTitle("Continuous Uniform Probability Distribution")
p.setKey(JavaPlot.Key.OFF)
p.plot
}
