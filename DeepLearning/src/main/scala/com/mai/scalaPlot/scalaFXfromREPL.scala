
// this code creates a GUI in REPL

package com.mai.scalaPlot


import javax.swing.JFrame
import javafx.embed.swing.JFXPanel
import javax.swing.SwingUtilities
import javax.swing.WindowConstants
//import scalafx.application.Platform
import scala.concurrent.ExecutionContext.Implicits.global //use Future


concurrent.Future{
object REPL {

val frame = new JFrame ("my frame")
val panel = new JFXPanel()
frame.add(panel)
frame.setSize(600, 600)

frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
frame.setVisible(true)

// use frame.dispose() if you want to close the GUI

}
}
/*
References:

Mark Lewis: SwiftVis2, FXRenderer.scala ( https://github.com/MarkCLewis/SwiftVis2/blob/master/src/main/scala/swiftvis2/plotting/renderer/FXRenderer.scala )
Irina Fedortsova: Integrating JavaFX into Swing Applications ( http://docs.oracle.com/javafx/2/swing/swing-fx-interoperability.htm )

https://bugs.openjdk.java.net/browse/JDK-8089371

*/


