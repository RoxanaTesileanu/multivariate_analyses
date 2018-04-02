val simplestNetwork = (input: Double, weight :Double) => input*weight
val prediction1 = simplestNetwork(8.5, 0.1)
def multipleOut1Inp (myWeights : Array[Double], myInput : Double) : Array[Double] = {
val myPredictions = myWeights map (i => (i*myInput))
myPredictions
}
multipleOut1Inp(Array(0.3, 0.2, 0.9), 0.65)
def multipleInp1Out (myWeights : Array[Double], myInputs: Array[Double]) : Double = {
val myPairs = myWeights zip myInputs
val pairsProd = myPairs.map(p => (p._1 * p._2))
pairsProd.sum
}
def arrayOp (myWeights : Array[Double], myInputs : Array[Double], f: (Double, Double)=> Double) = {
val myPairs = myWeights zip myInputs
val myOp = myPairs map (p=> (f(p._1, p._2)))
myOp
}
val elementwiseAddition = arrayOp(Array(0.1, 0.2, 0), Array(8.5, 0.65, 1.2),_ + _) 
val elementwiseMultiplication = arrayOp(Array(0.1, 0.2, 0), Array(8.5, 0.65, 1.2), _ * _)
val elementwiseMultiplication = arrayOp(Array(0.1, 0.2, 0), Array(8.5, 0.65, 1.2), _ * _)
def arrayOpAdd (myW: Array[Double], myI : Array[Double]) : Array[Double] = {
val elementwiseAddition = arrayOp(myW, myI, _+_)
elementwiseAddition
}
def dot (a : Array[Double], b: Array[Double]) : Double = {
assert(a.length == b.length, "The dot product cannot be computed!")
val pairs = a zip b
val pairProd = for (p <- pairs) yield {p._1 * p._2}
val dot = pairProd.sum
dot
}
val Arr = Array(Array(1,2,3,4), Array(5,6,7,8))
def matrixMultipl (a:Array[Array[Double]], b: Array[Array[Double]]) : Array[Array[Double]] = {
val tb = b.transpose
assert( tb(0).length == a(0).length, "Matrices cannot be multiplied!")
val c = for (i <- a) yield (tb.map { j => dot(j, i) })
c
}
Arr
val Arr1 = Array(0.2, 0.3, 0.4)
Arr1.map(i=> i +1)
Arr1.foreach(_ + 12)
val Arr2 = Arr1.foreach(_ + 12)
val myWeights = Array(Array(0.1, 0.1, -0.3), Array(0.1, 0.2, 0.0), Array(0.0, 1.3, 0.1))
def matrixMultipl (a:Array[Array[Double]], b: Array[Array[Double]]) : Array[Array[Double]] = {
val tb = b.transpose
assert( tb(0).length == a(0).length, "Matrices cannot be multiplied!")
val c = for (i <- a) yield (tb.map { j => dot(j, i) })
c
}
def neural_network (myWeights: Array[Array[Double]], myInputs: Array[Array[Double]]): Array[Array[Double]] = {
 assert(myWeights(0).length == myInputs(0).length, "Matrices cannot be multiplied!") 
 val myInTranspose = myInputs.transpose
 val matMultiplication= matrixMultipl(myWeights, myInputs)
 matMultiplication
}
val myWeights = Array(Array(0.1, 0.1, -0.3), Array(0.1, 0.2, 0.0), Array(0.0, 1.3, 0.1))
val myInputs =  Array(Array(8.5, 0.65, 1.2))
def neural_network (myWeights: Array[Array[Double]], myInputs: Array[Array[Double]]): Array[Array[Double]] = {
  val myInTranspose = myInputs.transpose
 assert(myWeights(0).length == myInputs(0).length, "Matrices cannot be multiplied!")  
 val matMultiplication= matrixMultipl(myWeights, myInputs)
 matMultiplication
}
def neural_network (myWeights: Array[Array[Double]], myInputs: Array[Array[Double]]): Array[Array[Double]] = {
  val myInTranspose = myInputs.transpose
 assert(myWeights(0).length == myInTranspose(0).length, "Matrices cannot be multiplied!")  
 val matMultiplication= matrixMultipl(myWeights, myInputs)
 matMultiplication
}
def neural_network (myWeights: Array[Array[Double]], myInputs: Array[Array[Double]]): Array[Array[Double]] = {
  val myInTranspose = myInputs.transpose
 assert(myWeights(0).length == myInputs(0).length, "Matrices cannot be multiplied!")  
 val matMultiplication= matrixMultipl(myWeights, myInTranspose)
 matMultiplication
}
neural_network(myWeights, myInputs)
