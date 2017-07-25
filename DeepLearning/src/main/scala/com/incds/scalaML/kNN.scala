package com.incds.scalaML

object kNN{

import scala.math._
import scala.util.Sorting

val dataMatrix = Vector(Array(1.0, 1.1), Array(1.0, 1.0), Array(0.0, 0.0), Array(0.0, 0.1))
val dataLabels = Vector(1, 1, 2, 2)
val classes = Range (dataLabels.min, dataLabels.max+1)

case class createData (dataMatrix: Vector[Array(Double)], dataLabels: Vector[Int], classes: Range) 

val dataSet = createData(dataMatrix, dataLabels, classes)
 p

def classifykNN (P:Vector[Array(Double)], dataSet: createData, k: Int) : Unit={

def distance (P1: Vector[Array(Double)], P2: Vector[Array(Double)]) : Double = {
  
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
