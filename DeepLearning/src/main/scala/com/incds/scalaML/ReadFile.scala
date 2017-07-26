/* The function readFileClassif() reads txt and csv files. The first row is assumed to contain the header and the last column is assumed to contain the labels. It returns a tuple with the information needed for the kNN classifier. 

*/ 


package com.incds.scalaML


object ReadFile {

import scala.math._

def readFileClassif (filename: String, delim: String) :  (Vector[Array[Double]], Vector[Int],  Range) = {

val src = scala.io.Source.fromFile(filename)
val data = src.getLines.map(_.split(delim)).toArray.drop(1)
src.close()
val len = data(0).length
val data2 = data.map( for (i <- _) yield(i))

val data3= data2.map( for (i <- _) yield (i.toDouble))

val dataMatrix= data3.map{ case x => x.take(len-1)}.toVector

val dataLabels = data3.map{ case x => x.last.toInt}.toVector

val classes = Range(dataLabels.min, dataLabels.max+1)

(dataMatrix, dataLabels, classes)
}

}

/* References:

Peter Harrington - "Machine Learning in Action", 2012
Jason Swartz - "Learning Scala", 2015
Martin Odersky, Lex Spoon, Bill Venners - "Programming in Scala", Second Edition, 2010
*/
