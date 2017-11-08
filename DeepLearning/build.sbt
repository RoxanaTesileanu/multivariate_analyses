name := "DeepLearning"
scalaVersion := "2.11.10"
fork in run := true



//scalaVersion := "2.10.1"
libraryDependencies ++= Seq(
"org.scalafx" %% "scalafx" % "8.0.92-R10",
 "org.scala-lang" % "scala-swing" % "2.10.2",


"com.github.rwl" % "core-lapack" % "0.1",

// https://mvnrepository.com/artifact/com.github.fommil.netlib/core
"com.github.fommil.netlib" % "core" % "1.1.2",

//"org.apache.spark" % "spark-core_2.11" % "2.1.1" % "provided",
//"org.apache.spark" % "spark-mllib_2.11" % "2.1.1" % "provided",
// https://mvnrepository.com/artifact/net.sourceforge.f2j/arpack_combined_all
"net.sourceforge.f2j" % "arpack_combined_all" % "0.1"

//"org.gdal" % "gdal" % "1.11.2" ,
//"org.locationtech.geogig" % "geogig-geotools" % "1.2.0-RC1",

//"org.locationtech.geotrellis" %% "geotrellis-raster" % "1.0.0",
//"org.locationtech.geotrellis" % "geotrellis-vector_2.11" % "1.1.1",

//"org.locationtech.geotrellis" % "geotrellis-geotools_2.11" % "1.1.1",
//"org.locationtech.geotrellis" % "geotrellis-geotools_2.11" % "1.2.0-M1",


//"org.geotools" % "gt-legacy" % "2.6.6",
//"org.geotools" % "gt2-legacy" % "2.2-RC2",


//"org.geotools" % "gt-main" % "16.1",
//"org.geotools" % "gt-epsg-hsql" % "16.1" % "test",

//"org.geotools" % "gt-epsg-hsql" % "16.1",

//"org.geotools" % "gt-referencing" % "16.1",
//"org.geotools" % "gt-shapefile" % "16.1",

//"org.apache.tomcat" % "tomcat-jni" % "9.0.1",

//"org.geotools" % "gt-ogr-jni" % "16.0",
//"org.geotools" % "gt-ogr-core" % "16.0",

//"org.locationtech.geotrellis" % "geotrellis-geotools_2.11" % "1.1.0",

//"org.locationtech.geotrellis" % "geotrellis-shapefile_2.11" % "1.1.0",
//"org.locationtech.geotrellis" % "geotrellis-vectortile_2.11" % "1.1.0"

//"net.java.dev.jna" % "jna-platform" % "4.1.0"

//"org.gdal" % "gdal" % "2.2.1",
//"com.azavea.geotrellis" % "geotrellis-gdal_2.10" % "0.10.0-M1",
//"com.azavea.geotrellis" % "geotrellis-vector_2.11" % "1.0.0-RC1"
//"com.azavea.geotrellis" % "geotrellis-geotools_2.10" % "0.10.0-M1",
//"com.azavea.geotrellis" % "geotrellis-vector_2.10" % "0.10.3",

//"org.geotools" % "gt-main" % "18.0",

//"org.geotools" % "gt2-shapefile" % "2.4.5",
//"org.geotools" % "gt-shapefile" % "17.2"
//"org.geotools" % "gt-shapefile" % "18.0"

)

resolvers += "osgeo" at "http://download.osgeo.org/webdav/geotools"
resolvers += "boundless" at "http://repo.boundlessgeo.com/main"
resolvers += "imageio" at "http://maven.geo-solutions.it"

unmanagedJars in Compile += Attributed.blank(file("/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/jfxrt.jar"))

unmanagedJars in Compile += Attributed.blank(file("/lib/gdal-2.2.1.jar"))




//"co.theasi" %% "plotly" % "0.2.0"

//"org.scala-graph" % "graph-core" % "1.11.5"


//"org.specs2" % "specs2-core_2.11" % "3.5" % "test",
//"com.cra.figaro" % "figaro" % "2.1.0.0",
//"org.scalanlp" % "breeze_2.11" % "0.11.2",
//"darrenjw" %% "scala-glm" % "0.2",
//"org.apache.spark" % "spark-core_2.11" % "2.1.1" % "provided",
//"org.apache.spark" % "spark-mllib_2.11" % "2.1.1" % "provided",
//"com.databricks" % "spark-csv_2.11" % "1.5.0",
//"com.univocity" % "univocity-parsers" % "2.4.1",
//"org.apache.spark" % "spark-sql_2.11" % "2.1.1",
//"org.apache.commons" % "commons-math3" % "3.6",
//"org.jfree" % "jfreechart" % "1.0.18"

//resolvers ++= Seq("scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
//"Newcastle mvn repo" at "https://www.staff.ncl.ac.uk/d.j.wilkinson/mvn/")


/* References:

https://stackoverflow.com/questions/43293718/sbt-cant-resolve-osgeo-jai-maven-dependencies

Joshua Suereth, Matthew Farwell, 2016, sbt in Action - The Simple Scala Build Tool, Manning

Jarek Sacha, Coding on the Staircase (https://codingonthestaircase.wordpress.com/2013/05/)
Jarek Sacha, ScalaFX-Tutorials (https://github.com/scalafx/ScalaFX-Tutorials/blob/3449d6341ef276ffc353c7a511579a59fd9a8c3f/hello-sbt/build.sbt)

Wilkinson D. J., 2017 - Statistical Computing with Scala: A functional approach to data science, https://github.com/darrenjw/scala-course






Resolver scalaz-stream at: https://github.com/etorreborre/specs2/issues/347
*/




