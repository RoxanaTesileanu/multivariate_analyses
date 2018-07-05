// Reading different types of sources into Scala
import scala.io.Source

val source = Source.fromFile("myData.txt")
val lines = source.getLines.map(_.toArray)
source.close

val source2 = Source.FromURL("https://www.....", "iso....")
read the lines and transform them to an Array

val source3 = getClass.getResource("/employees.sql")

scala> val source3 = getClass.getResource("/employees.sql")
source3: java.net.URL = file:/home/barbu/multivariate_analyses/DeepLearning/target/scala-2.11/classes/employees.sql


// References: Alex Fruzenshtein, http://fruzenshtein.com/scala-working-with-resources-folders-files/
// and book of Mark Lewis.
