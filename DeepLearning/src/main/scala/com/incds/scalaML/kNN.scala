package com.incds.scalaML

object kNN{

import scala.math._
import scala.util.Sorting
import breeze.linalg._

val dataMatrix = Vector(Array(1.0, 1.1), Array(1.0, 1.0), Array(0.0, 0.0), Array(0.0, 0.1))
val dataLabels = Vector(1, 1, 2, 2)
val classes = Range (dataLabels.min, dataLabels.max+1)

case class CreateData (dataMatrix: Vector[Array[Double]], dataLabels: Vector[Int], classes: Range) 

val dataSet =  new CreateData(dataMatrix, dataLabels, classes)

def classifykNN (P:Vector[Array[Double]], dataSet: createData, k: Int) : Int={

def distance (P1: Vector[Array[Double]], P2: Vector[Array[Double]]) : Double = {
  
val featuresP1 = for (i <- P1(0)) yield i
val featuresP2 = for (i <- P2(0)) yield i
val pointDiff = featuresP1 - featuresP2
val pointDiffPow = for (i <- pointDiff) yield pow(i,2)
val d = sqrt(sum(pointDiffPow))
d
}

def sortingDist (dataSet: createData) : Vector[(Double, Int)] = {

val distances = dataSet.dataMatrix map(x => distance(P, Vector(x))) 

val labeledDist = distances zip(dataSet.dataLabels)

val sortedDist = labeledDist.sortBy(_._1)
sortedDist
}

val sortedDist = sortingDist(dataSet)

def countingClasses (sortedDist: Vector[(Double, Int)]) : Int = {
val kN = sortedDist.slice(0, k)
val countClasses =for (i <- dataSet.classes) yield(kN.count(_._2 == i)) 
val classesAndCounts = classes zip countClasses
val result = classesAndCounts.sortBy(_._2).last._1
result

}
return(countingClasses(sortedDist))

}


//trying out the kNN algorithm:

val result = classifykNN(Vector(Array(0.1, 0.1)), dataSet, 3)

}

/* References: 
Machine Learning in Action - Peter Harrington, 2012 
Learning Scala - Jason Swartz, 2015
*/
