class FrameListner extends Frame implements WindowListner {
    FrameDemo(){
        SetVisible(true);
        SetSize(500,500);
        setTitle("First Window");
        addWindowListener(this);
    }

}