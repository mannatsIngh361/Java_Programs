import java.awt.*;
import java.awt.event.*;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.applet.*;

/*
 * <applet code="KeyEvents" width="300" height="100"></applet>
 */
public class KeyEvents extends Applet implements KeyListener {
    String msg = "";
    int x = 10, y = 20;

    public void init() {
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("key down");
        KeyCode key = ke.getCode();
        switch (key) {
            case key.F1:
                msg += "<F1>";
                break;
            case key.F2:
                msg += "<F2>";
                break;
            case key.F3:
                msg += "<F3>";
                break;
            case key.PAGE_DOWN:
                msg += "<PgDn>";
                break;
            case key.PAGE_UP:
                msg += "<PgUn>";
                break;
            case key.LEFT:
                msg += "<Left Arrow>";
                break;
            case key.RIGHT:
                msg += "<Right Arrow>";
                break;
        }
        repaint();

    }

    public void keyReleased(KeyEvents ke) {
        showStatus("Key up");
    }

    public void keyTyped(KeyEvents ke) {
        msg += ke.getKeyChar();

        repaint();
    }

    private String getKeyChar() {
        return null;
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, y);
    }

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
