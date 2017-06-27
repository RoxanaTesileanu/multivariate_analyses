/* working through the notes of D. J Wilkinson (2017): "Statistical Computing with Scala - A functional approach to data science", https://github.com/darrenjw/scala-course, ch. 4, Scala Breeze
*/

import breeze.stats.distributions._
import breeze.linalg._
import breeze.plot._	//no need to add breeze-viz to the bild.sbt file

object MyFigure{
val fig = Figure("My Figure")
fig.width = 1000
fig.height = 800
val p1= fig.subplot(0)
val y = Gaussian(0.0, 1.0).sample(1000).toArray
p1 += hist(y, 50)
p1.xlim(-3,3)
p1.xlabel = "my randomly generated sample"
p1.title = "Distribution of observed response"
fig.refresh
fig.saveas("hist.pdf")



}
