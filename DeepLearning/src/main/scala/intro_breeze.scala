/* working through the notes of D. J Wilkinson (2017): "Statistical Computing with Scala - A functional approach to data science", https://github.com/darrenjw/scala-course, ch. 4, Scala Breeze
*/

import breeze.stats.distributions._
import breeze.linalg._

object IntroBreeze {
val poi = Poisson(3.0)

val x = poi.sample(10) 
val pmfXs = x map {poi.probabilityOf(_)}

val gau = Gaussian(0.0, 1.0)

val y1 = gau.sample(20)

val logPdfYs= y1 map { gau.logPdf(_)}


val v= DenseVector(y1.toArray) // create a Vector out of the sample
val exBitVect= v >:> 0.0 // returns the indexes of the elements for which the Boolean expression is true

val exBooleanResult = (v >:> 0.0).toArray //returns the Boolean result for each element of the array

val m = new DenseMatrix(5,4,linspace(1.0,20.0, 20).toArray) // the elements are arranged column-by-column

val sumCols = sum(m(::,*))
val sumRows = sum(m(*,::))

val n = m.t

val o = n*m //result o has the shape (4,4) 
val p= m*n //result p has the shape (5,5)

//application

val N = 1000
val P = 2
val XX = new DenseMatrix(N,P, gau.sample(N*P).toArray)

val X = DenseMatrix.horzcat(DenseVector.ones[Double](N).toDenseMatrix.t, XX)

val b0=linspace(1.0,2.0,P+1)
val y0 = X*b0

val y = y0 + DenseVector(gau.sample(1000).toArray)

val b=X\y //computed using the QR-decomposition of X

//writing to file and reading data from file

import java.io.File

csvwrite(new File("x_matrix.csv"), X)

val X2 = csvread(new File("x_Matrix.csv"))

}
