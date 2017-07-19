object kNN{

import breeze.linalg._
import scala.math._
import scala.util.Sorting

val group = DenseVector((1.0, 1.1), (1.0, 1.0), (0.0, 0.0), (0.0, 0.1))
val lables = DenseVector(Array('A', 'A', 'B', 'B'))
case class createData (group: DenseVector[(Double, Double)], labels: DenseVector[Char]) 

val dataSet = createData(group, lables)
 


class classifykNN (P:DenseVector[(Double, Double)], dataSet: createData, k: Int)  {

def distance (P1: DenseVector[(Double,Double)], P2: DenseVector[(Double,Double)]) : Double = {
  
val d = sqrt(pow(P1(0)._1 - P2(0)._1, 2) + pow(P1(0)._2- P2(0)._2,2))
d
}

val distances = dataSet.group map(x => distance(P, DenseVector(x))) 

val labeledDist = distances.toScalaVector zip(lables.toScalaVector)

//def sortingDist (labeledDist : Vector[(Double, Char)]) : Vector[(Double, Char)] ={


//}


}
}

/* References: Machine Learning in Action - Peter Harrington, 2012 
*/
