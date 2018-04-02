// I will use for matrix operations the functions from BasicVectorOP.scala
import com.mai.scalaML.BasicVectorOP._

object MultipleInpOut {

val myWeights = Array(Array(0.1, 0.1, -0.3), Array(0.1, 0.2, 0.0), Array(0.0, 1.3, 0.1))
val myInputs =  Array(Array(8.5, 0.65, 1.2))

def neural_network (myWeights: Array[Array[Double]], myInputs: Array[Array[Double]]): Array[Array[Double]] = {
  val myInTranspose = myInputs.transpose
 assert(myWeights(0).length == myInputs(0).length, "Matrices cannot be multiplied!")  
 val matMultiplication= matrixMultipl(myWeights, myInTranspose)
 matMultiplication
}

