package com.mai.scalaML
/* 
The BasicVectorOP object offers basic operations for two arrays: dot product, elementwise addition, subtraction, and multiplication. I will extend it to matrices multiplication.    
 
*/

object BasicVectorOP {


def dot (a : Array[Double], b: Array[Double]) : Double = {
val pairs = a zip b
val pairProd = for (p <- pairs) yield {p._1 * p._2}
val dot = pairProd.sum
dot
}

def arrayOP(a: Array[Double], b: Array[Double], f: (Double, Double) => Double) = {
val pairs = a zip b
val OP = for (p <- pairs) yield {f(p._1, p._2)}
OP
}

def arrayAdd (a: Array[Double], b:Array[Double]) : Array[Double] = {
val elementwiseAddition = arrayOP(a,b, _ + _)
elementwiseAddition
}

def arraySubt (a: Array[Double], b: Array[Double]) : Array[Double] = {
val elementwiseSubtraction = arrayOP(a,b, _ - _)
elementwiseSubtraction
}

def arrayMultipl (a: Array[Double], b:Array[Double]) : Array[Double] = {
val elementwiseMultipl = arrayOP(a,b, _ * _)
elementwiseMultipl
}

def matrixMultipl (a:Array[Array[Double]], b: Array[Array[Double]]) : Array[Array[Double]] = {
val tb = b.transpose
assert( tb(0).length == a(0).length, "Matrices cannot be multiplied!")
val c = for (i <- a) yield (tb.map { j => dot(j, i) })
c
}


}
/* References:

Swartz Jason 2015 - "Learning Scala", Manning Publications Co., Shelter Island 
Trask Andrew 2017 - "Grokking deep learning", Manning Publications Co., Shelter Island 
Odersky Martin, Spoon Lex, Venners Bill 2010 - "Programming in Scala", Second Edition, Artima, Walnut Creek
*/


