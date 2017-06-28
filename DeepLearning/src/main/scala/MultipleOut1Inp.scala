object MultipleOut1Inp {

def neural_network (myWeights: Array[Double], myInput : Double) : Array[Double] = {
 
val myPredictions = myWeights map(i => (i*myInput)) 
myPredictions
}

//let's test the code with Andrew's example

val testMultipleOut1Inp = neural_network(Array(0.3, 0.2, 0.9), 0.65)


}

