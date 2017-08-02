/* In order to test the kNN classifier you can use the testFrameWorkClassif() function. The error rate is given by the total number of errors (misclassified observations) divied by the total number of tested observations.   

*/

package com.mai.scalaML

object TestFrameWorkClassif {

import scala.util.Random._
import com.mai.scalaML.kNN._

/*def testFrameWorkClassif ( dataSet: CreateData, partition : Double, k :Int) : Double = {

val dataMatrix = dataSet.dataMatrix
val dataLabels = dataSet.dataLabels
val dataPlusLabels = dataMatrix.zip(dataLabels)
val shuffledDataPlusLabels = shuffle(dataPlusLabels)
val lenDataSet = shuffledDataPlusLabels.length
val testAndClassSets = shuffledDataPlusLabels.splitAt(lenDataSet * partition)
val testDataSet = testAndClassSets._1
val classifDataSet = testAndClassSets._2
val testDataMatrix = testDataSet.map{ x => x._1 }
val testDataLabels = testDataSet.map{ x => x._2 }
val classesTest = dataSet.classes
val usedTestDataSet = new CreateData(testDataMatrix, testDataLabels, classesTest)
 

}
*/




}

/* References:

Harrington Peter 2012 - "Machine learning in action", Manning Publications Co., Shelter Island
Odersky Martin, Spoon Lex, Venners Bill 2010 - "Programming in Scala", Second Edition, Artima, Walnut Creek
Bugnion Pascal 2016 - "Scala for Data Science", Packt Publishing, Birmingham
Scala Standard Library 2.12.0 -scala.util.Random - http://www.scala-lang.org/api/2.12.1/scala/util/Random.html
*/
