
object GradientDescent{
var weight = 0.5
val goalPred = 0.8
val input = 2
val alpha = 0.1


@annotation.tailrec
def updatingWeights (weight: Double, goalPred:Double,
                     input: Double, alpha :Double) : Double = {

  var prediction = input * weight
  var error = prediction - goalPred
  var derivative = input* (prediction - goalPred)


    if (derivative < 0.01) weight
    else updatingWeights(weight, goalPred, input, alpha)

}

updatingWeights(0.5, 0.8, 2, 0.1)
}
