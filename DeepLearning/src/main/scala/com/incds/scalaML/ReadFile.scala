package com.incds.scalaML
 
object ReadFile {

def readFileClassif (filename: String, delim: String) :  (Array[List[Double]], Array[List[Double]])= {

val src = scala.io.Source.fromFile(filename)
val data = src.getLines.map(_.split(delim)).toArray.drop(1)
src.close()
val len = data(0).length
val data2 = data.map( for (i <- _) yield(i))

val data3= data2.map( for (i <- _) yield (i.toDouble))

val dataMatrix= data3.map { case x => x.take(len-1)}

val dataLabels = data3.map { case x => x.last}


(dataMatrix, dataLabels)
}

}

/* References:

Peter Harrington - "Machine Learning in Action", 2012
Jason Swartz - "Learning Scala", 2015
Martin Odersky, Lex Spoon, Bill Venners - "Programming in Scala", Second Edition, 2010
*/
