object kNN{

import breeze.linalg._
import scala.math._
import scala.util.Sorting

val group = DenseMatrix((1.0, 1.1), (1.0, 1.0), (0.0, 0.0), (0.0, 0.1))
val lables = DenseVector(Array('A', 'A', 'B', 'B'))
case class createData (group: DenseMatrix[Double], labels: DenseVector[Char]) 

val dataSet = createData(group, labels)
 


class classifykNN (P:DenseVector[Double], dataSet: createData, k: Int)  {

def distance (P1: DenseVector[Double], P2: DenseVector[Double]) : Double = {
  
val d = sqrt(pow(P1(0)- P2(0),2) + pow(P1(1) - P2(1),2))
d
}

val distances = dataSet.group map(x => distance(P, x))

val labeledDist = distances.zip(labels)

def sortingDist (labeledDist : DenseVector[(Double, Char)]) : DenseVector[(Double, Char)] ={


}

/* References: Machine Learning in Action - Peter Harrington, 2012 
*/
