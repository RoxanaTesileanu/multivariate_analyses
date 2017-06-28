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

}
