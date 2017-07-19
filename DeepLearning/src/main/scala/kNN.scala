object kNN{

import scala.math._
import scala.util.Sorting

val group = Vector((1.0, 1.1), (1.0, 1.0), (0.0, 0.0), (0.0, 0.1))
val lables = Vector('A', 'A', 'B', 'B')
val classes = Vector('A', 'B')

case class createData (group: Vector[(Double, Double)], lables: Vector[Char], classes: Vector[Char]) 

val dataSet = createData(group, lables, classes)
 

def classifykNN (P:Vector[(Double, Double)], dataSet: createData, k: Int) : Unit={

def distance (P1: Vector[(Double,Double)], P2: Vector[(Double,Double)]) : Double = {
  
val d = sqrt(pow(P1(0)._1 - P2(0)._1, 2) + pow(P1(0)._2- P2(0)._2,2))
d
}

def sortingDist (dataSet: createData) : Vector[(Double, Char)] = {

val distances = dataSet.group map(x => distance(P, Vector(x))) 

val labeledDist = distances zip(dataSet.lables)

val sortedDist = labeledDist.sortBy(_._1)
sortedDist
}

val sortedDist = sortingDist(dataSet)

def countingClasses (sortedDist: Vector[(Double, Char)]) : Char = {
val kN = sortedDist.slice(0, k)

if ((kN.count(_._2 == dataSet.classes(0))) > (kN.count(_._2 == dataSet.classes(1)))) dataSet.classes(0) else dataSet.classes(1)

}

println(countingClasses(sortedDist))

}


//trying out the kNN algorithm:

val result = classifykNN(Vector((0.1, 0.1)), dataSet, 3)

}

/* References: 
Machine Learning in Action - Peter Harrington, 2012 
Learning Scala - Jason Swartz, 2015
*/
