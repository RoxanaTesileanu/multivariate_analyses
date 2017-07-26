package com.incds.scalaML
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

/*def arrayOP2 (a: Array[Array[Double]], b: Array[Array[Double]], f: (Array[Double], Array[Double]) => Array[Double]) = {
val pairs = (a zip b).toArray
val OP = for (p <- pairs) yield {f(p._1, p._2)}
OP
}
*/

def matrixMultipl (a: Array[Array[Double]], b: Array[Array[Double]]) : Array[Array[Double]] = {

val tb = b.transpose.map{case x=> x.toArray}
val pairs1 = (a zip tb).toArray
val mMultipl1 = pairs1.map( p=> dot(p._1, p._2))
val pairs0 = (a.reverse zip tb).toArray
val mMultipl0 = pairs0.map( p => dot(p._1, p._2))
val product = Array(Array(mMultipl0(0), mMultipl1(1)), Array(mMultipl1(0), mMultipl0(1)))
product
}

/* References:

Swartz Jason 2015 - "Learning Scala", Manning Publications Co., Shelter Island 
Trask Andrew 2017 - "Grokking deep learning", Manning Publications Co., Shelter Island 
Odersky Martin, Spoon Lex, Venners Bill 2010 - "Programming in Scala", Second Edition, Artima, Walnut Creek
*/


