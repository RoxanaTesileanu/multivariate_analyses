// this code creates a GUI in REPL

import javax.swing.JFrame
import javafx.embed.swing.JFXPanel
import javax.swing.SwingUtilities


object REPL {

val frame = new JFrame ("my frame")
val panel = new JFXPanel()
frame.add(panel)
frame.setSize(600, 600)
frame.setVisible(true)
// use frame.dispose() to close the GUI 
 
}

/*
References:
Irina Fedortsova: Integrating JavaFX into Swing Applications ( http://docs.oracle.com/javafx/2/swing/swing-fx-interoperability.htm )

*/
