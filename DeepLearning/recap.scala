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
