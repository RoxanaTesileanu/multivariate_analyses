

// this code creates a GUI in REPL

package com.mai.scalaPlot


import javax.swing.JFrame
import javafx.embed.swing.JFXPanel
import javax.swing.SwingUtilities
//import javax.swing.WindowConstants
import scalafx.application.Platform
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global //use Future
import scalafx.event.ActionEvent
import scalafx.scene.Scene
import scalafx.stage.Stage
import scalafx.scene.canvas.Canvas

object REPL {


val frame = new JFrame ("My GUI")
val panel = new JFXPanel()
frame.add(panel)
frame.setSize(400, 400)

//frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
frame.setVisible(true)
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)


}

// use frame.dispose() if you want to close the GUI



/*
scala> javafx.application.Platform.runLater{
     | val frame = new JFrame("..")
     | val panel = new JFXPanel()
     | frame.add(panel)
     | frame.setVisible(true)
     | frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)}
<console>:22: error: type mismatch;
 found   : Unit
 required: Runnable
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)}

_____________________________________________________________
scala> object ShellFX extends JFXApp{}
defined object ShellFX

scala> ShellFX.
delayedInit   hostServices   main   stage   stopApp

scala> ShellFX.main
   def main(args: Array[String]): Unit

scala> Future{ ShellFX}
res0: scala.concurrent.Future[ShellFX.type] = Future(<not completed>)

scala> val mygui = Future{ShellFX}
mygui: scala.concurrent.Future[ShellFX.type] = Future(Success(ShellFX$@7b7cf806))

*/

/*
References:

Mark Lewis: SwiftVis2, FXRenderer.scala ( https://github.com/MarkCLewis/SwiftVis2/blob/master/src/main/scala/swiftvis2/plotting/renderer/FXRenderer.scala )
Irina Fedortsova: Integrating JavaFX into Swing Applications ( http://docs.oracle.com/javafx/2/swing/swing-fx-interoperability.htm )

https://bugs.openjdk.java.net/browse/JDK-8089371

*/


