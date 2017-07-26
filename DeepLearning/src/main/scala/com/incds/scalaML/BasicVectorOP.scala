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

def 





}
