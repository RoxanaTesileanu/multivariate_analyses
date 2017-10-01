// this code creates a GUI in REPL

import javax.swing.JFrame
import javafx.embed.swing.JFXPanel
import javax.swing.Utilities

val frame = new JFrame ("my frame")
val panel = new JFXPanel()
frame.add(panel)
frame.setSize(600, 600)
frame.setVisible(true)

/*
References:
Irina Fedortsova: Integrating JavaFX into Swing Applications ( http://docs.oracle.com/javafx/2/swing/swing-fx-interoperability.htm )

*/
