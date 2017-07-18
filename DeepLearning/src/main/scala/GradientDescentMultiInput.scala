object GradientDescentMultiInput {

import breeze.linalg._
import scala.math._

val myW = new DenseVector(Array(0.1, 0.2, -0.1))
val myI = new DenseVector(Array(8.5, 0.65, 1.2))
val goalPredict = new DenseVector(Array(1,1,0,1))
@annotation.tailrec
def updatingWeights (myWeights: DenseVector[Double], goalPred:Double,
                     myInputs: DenseVector[Double], alpha :Double) : Unit = {

  def predict (myInputs: DenseVector[Double], myWeights: DenseVector[Double]) : Double= {
val dotProduct = myInputs dot myWeights
dotProduct
}
  var error = predict(myInputs, myWeights) - goalPredict(0)
  var derivative = myInputs* (predict(myInputs, myWeights) - goalPredict(0))

    if (abs(error) < 0.001) println(predict(myInputs, myWeights) , error, myWeights)
    else updatingWeights(myWeights - alpha * derivative, goalPred, myInputs, alpha)
}

}


