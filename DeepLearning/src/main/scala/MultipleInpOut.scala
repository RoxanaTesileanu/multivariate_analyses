import breeze.linalg._


object MultipleInpOut {

val myWeights = DenseMatrix((0.1, 0.1, -0.3), (0.1, 0.2, 0.0), (0.0, 1.3, 0.1))
val myInputs =  DenseMatrix(Array(8.5, 0.65, 1.2)).t

def neural_network (myWeights: DenseMatrix[Double], myInputs: DenseMatrix[Double]): DenseMatrix[Double] = {
 assert(myWeights.cols == myInputs.rows, "Matrices cannot be multiplied!") 
 val matMultiplication= myWeights * myInputs
 matMultiplication
}

//let's test it with Andrew's example:

val testMultipleInpOut = neural_network(myWeights, myInputs)

// we can insert a hidden layer inbetween the final prediction:

val myW = DenseMatrix((0.1, 0.2, -0.1), (-0.1, 0.1, 0.9), (0.1, 0.4, 0.1))
val myWh = DenseMatrix((0.3, 1.1, -0.3), (0.1, 0.2, 0.0), (0.0, 1.3, 0.1))
val myWeights2 = (myW, myWh)

def neural_network2 (myWeights: (DenseMatrix[Double], DenseMatrix[Double]), myInputs: DenseMatrix[Double]) : DenseMatrix[Double] = {

val hid= myWeights2._1*myInputs
val pred = myWeights2._2*hid
pred
}

//let's test it with Andrew's example:

val testMultipleInpOut2 = neural_network2(myWeights2, myInputs)


}
