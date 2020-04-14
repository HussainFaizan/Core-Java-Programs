import java.awt.*;
import java.awt.event.*;

class FrameDemo1 extends Frame {
    FrameDemo1() {
        this.setVisible(true);
        this.setSize(300, 500);
        this.setTitle("Windows Adapter");

        addWindowListener(new MyFrame());
    }

    public static void main(String[] args) {
        FrameDemo1 fd = new FrameDemo1();
    }
}

class MyFrame extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}