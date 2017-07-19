object kNN{

import breeze.linalg._
import scala.math._
import scala.util.Sorting

def createData (group: DenseMatrix[Double], labels: DenseVector[Char]) = {
 val group = DenseMatrix((1.0, 1.1), (1.0, 1.0), (0.0, 0.0), (0.0, 0.1))
 val lables = DenseVector(Array('A', 'A', 'B', 'B')
 group, lables
}

def classifykNN (P:DenseVector[Double], group: DenseMatrix[Double], labels: DenseVector[Char], k: Int) = {

def distance (P1: DenseVector[Double], P2: DenseVector[Double]) : Double = {
  
val d = sqrt(pow(P1(0)- P2(0),2) + pow(P1(1) - P2(1),2))
d
}

val distances = group map(x => distance(X, x))

distances.zip(labels)


}

/* References: Machine Learning in Action - Peter Harrington, 2012 
*/
