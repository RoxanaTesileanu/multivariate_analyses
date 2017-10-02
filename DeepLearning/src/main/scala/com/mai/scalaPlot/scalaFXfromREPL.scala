
// this code creates a GUI in REPL

package com.mai.scalaPlot


import javax.swing.JFrame
import javafx.embed.swing.JFXPanel
import javax.swing.SwingUtilities


object REPL {

val frame = new JFrame ("my frame")
val panel = new JFXPanel()
frame.add(panel)
frame.setSize(600, 600)
frame.setVisible(true)
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

}

/*
References:
Irina Fedortsova: Integrating JavaFX into Swing Applications ( http://docs.oracle.com/javafx/2/swing/swing-fx-interoperability.htm )

*/


