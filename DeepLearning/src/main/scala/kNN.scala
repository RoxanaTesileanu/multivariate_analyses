object kNN{

//import breeze.linalg._
import scala.math._
import scala.util.Sorting

val group = Vector((1.0, 1.1), (1.0, 1.0), (0.0, 0.0), (0.0, 0.1))
val lables = Vector('A', 'A', 'B', 'B')
case class createData (group: Vector[(Double, Double)], labels: Vector[Char]) 

val dataSet = createData(group, lables)
 


class classifykNN (P:Vector[(Double, Double)], dataSet: createData, k: Int)  {

def distance (P1: Vector[(Double,Double)], P2: Vector[(Double,Double)]) : Double = {
  
val d = sqrt(pow(P1(0)._1 - P2(0)._1, 2) + pow(P1(0)._2- P2(0)._2,2))
d
}

val distances = dataSet.group map(x => distance(P, Vector(x))) 

val labeledDist = distances zip(lables)

//def sortingDist (labeledDist : Vector[(Double, Char)]) : Vector[(Double, Char)] ={


//}


}
}

/* References: 
Machine Learning in Action - Peter Harrington, 2012 
Learning Scala - Jason Swartz, 2015
*/
