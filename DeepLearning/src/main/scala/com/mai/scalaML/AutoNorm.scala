package com.mai.scalaML

object AutoNorm {


def autoNorm (dataMatrix : Vector[Array[Double]]) : Vector[Array[Double]] = {

val len = dataMatrix(0).length
val variables = for (i <- 0 to (len -1)) yield { for (a <- dataMatrix) yield a(i) }
val normalizedVariables = for (v <- variables) yield { v.map{ a => (a - v.min)/(v.max - v.min)}}
val minMaxRange = for (v <- variables) yield { (v.min, v.max, v.max - v.min) }
val len2 = normalizedVariables(0).length
val normalizedDataMatrix = for (i <- 0 to (len2-1)) yield { for (nv <- normalizedVariables) yield  (nv(i))}  
val normalizedDataMatrix2 = normalizedDataMatrix.map{ v => v.toArray}.toVector

normalizedDataMatrix2
}


}

/* References:

Harrington Peter 2012 - "Machine learning in action", Manning Publications Co., Shelter Island
Odersky Martin, Spoon Lex, Venners Bill 2010 - "Programming in Scala", Second Edition, Artima, Walnut Creek

*/
