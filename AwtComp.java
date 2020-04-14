import java.awt.*;

class AwtComp extends Frame {
    AwtComp() {
        java.awt.Frame f = new java.awt.Frame();
        f.setVisible(true);
        f.setSize(500, 500);
        f.setName("AWT Componants...");

    }
}

class AWT {
    public static void main(String[] args) {
        AwtComp t = new AwtComp();
    }
}