import scala.io._
object ReadPointCoordFromFile{

val source = Source.fromFile("pointcoord.csv")
val data = source.getLines.map(_.split(",")).toArray
val dataHP1 = data.filter(_(2) == "1")
dataHP1.length
val dataRoad1 = data.filter(_(2) == "2")
val dataRoad2 = data.filter(_(2) == "3")
dataRoad1.length
dataRoad2.length
val dataRoad3 = data.filter(_(2) == "4")
dataRoad3.length
val dataHP2 = data.filter(_(2) == "5")
dataHP2.length
val dataGPSTrack = data.filter(_(2) == "6")
dataGPSTrack.length
val dataHP3 = data.filter(_(2) == "7")
dataHP3.length
val dataStArea =  data.filter(_(2) == "8")
dataStArea.length
val pointsHP1 = dataHP1.map(i => (i(0).toDouble, i(1).toDouble))
pointsHP1.length
val pointsRoad1 = dataRoad1.map(i => (i(0).toDouble, i(1).toDouble))
val pointsRoad2 = dataRoad2.map(i => (i(0).toDouble, i(1).toDouble))
val pointsRoad3 = dataRoad3.map(i => (i(0).toDouble, i(1).toDouble))
val pointsHP2 = dataHP2.map(i => (i(0).toDouble, i(1).toDouble))
val pointsGPSTrack = dataGPSTrack.map(i => (i(0).toDouble, i(1).toDouble))
val pointsStArea = dataStArea.map(i => (i(0).toDouble, i(1).toDouble))
}

// I don't have yet the pointsHP3 and the polygons habitatPatch2 and stArea don't have a closed ring. I need new points for them. 

