object GradientDescentMultiInput {

val myW = Array(0.1, 0.2, -0.1)
val myI = Array(8.5, 0.65, 1.2)
val myPred = neural_network(myW, myI)
val goalPredict = Array(1,1,0,1)
@annotation.tailrec
def updatingWeights (myWeights: Array[Double], goalPred:Double,
                     myInputs: Array[Double], alpha :Double) : Unit = {

  def predict (myInputs: Array[Double], myWeights: Array[Double]) : Double= {
val myPairs = myWeights zip myInputs
val myPairProd = for (p <- myPairs) yield {p._1 * p._2}
val dotProduct = myPairProd.sum
dotProduct
}
  var error = predict(myInputs, myWeights) - goalPredict(0)
  var derivative = myInput* (predict(myInputs, myWeights) - goalPredict(0))

    if (error < 0.001) println(predict(myInputs, myWeights) , error, myWeights)
    else updatingWeights(myWeights - alpha * derivative, goalPred, myInputs, alpha)


}




















}
