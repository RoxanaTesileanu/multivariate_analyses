import scala.math._

object TreeProb {

val counts = Array (2,9,38,67,74,50,12,3)
val sumCounts = counts.sum
val probCounts = counts.map(i => i/sumCounts)

}
