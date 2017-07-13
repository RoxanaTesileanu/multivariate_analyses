object ExamapleLR {


val src = scala.io.Source.fromFile("CSCO.csv")

val data = src.getLines.map(_.split(",")).toArray.drop(1)

src.close()

val data2 = data.map(x => List(x(2), x(3), x(5)))

val data3 = data2.map{ case(List(param1, param2, param3)) => List(param1.toDouble, param2.toDouble, param3.toDouble)}

val finalData = data3.map{ case(List(param1, param2, param3)) => List( 1 - param2/param1 , param3)}

val volatility = finalData.map{ case List(param1, param2) => param1 }
val volume = finalData.map{ case List(param1, param2) => param2 }
val minMaxVolatility = (volatility.min, volatility.max)
val minMaxVolume = (volume.min, volume.max)
val normalizedVolatility = volatility.map(x => (x - minMaxVolatility._1)/(minMaxVolatility._2 - minMaxVolatility._1))
val normalizedVolume = volume.map(x=> (x - minMaxVolume._1)/(minMaxVolume._2 - minMaxVolume._1))

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import spark.implicits._

val conf = new SparkConf().setMaster("local").setAppName("My App")
val spark = SparkSession.builder().config(conf = conf).getOrCreate()


import org.apache.spark.ml.classification.LogisticRegression




}







