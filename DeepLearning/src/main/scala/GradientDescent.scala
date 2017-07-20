
object GradientDescent{

import scala.math._

@annotation.tailrec
def updatingWeights (weight: Double, goalPred:Double,
                     input: Double, alpha :Double) : Unit = {

  var prediction = input * weight
  var error = prediction - goalPred
  var derivative = input* (prediction - goalPred)

    if (abs(error) < 0.001) println(prediction , error, weight)
    else updatingWeights(weight - alpha * derivative, goalPred, input, alpha)

}

updatingWeights(0.5, 0.8, 2, 0.1)
}



