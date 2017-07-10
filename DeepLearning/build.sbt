name := "DeepLearning"
scalaVersion := "2.11.10"
libraryDependencies ++= Seq(
"org.specs2" % "specs2-core_2.11" % "3.5" % "test",
"com.cra.figaro" % "figaro" % "2.1.0.0",
"org.scalanlp" % "breeze_2.11" % "0.11.2",
"darrenjw" %% "scala-glm" % "0.2",
"org.apache.spark" % "spark-core_2.11" % "2.1.1" % "provided",
"org.apache.spark" % "spark-mllib_2.11" % "2.1.1" % "provided",
"com.databricks" % "spark-csv_2.11" % "1.5.0")

resolvers ++= Seq("scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
"Newcastle mvn repo" at "https://www.staff.ncl.ac.uk/d.j.wilkinson/mvn/")


/* References:
Joshua Suereth, Matthew Farwell, 2016, sbt in Action - The Simple Scala Build Tool, Manning
Wilkinson D. J., 2017 - Statistical Computing with Scala: A func-
tional approach to data science, https://github.com/darrenjw/
scala-course

Resolver scalaz-stream at: https://github.com/etorreborre/specs2/issues/347
*/



