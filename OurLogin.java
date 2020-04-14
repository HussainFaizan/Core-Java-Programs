import java.awt.*;

class Login extends Frame {
	Login() {
		super("WELCOME");
		// setLayout(new FlowLayout());
		setSize(250, 600);
		setVisible(true);
		TextField t3 = new TextField(15);
		t3.setBounds(200, 90, 15, 10);
		// Label l1=new Label();
		// l1.setText("welcome to NARESH IT");
		Label l1 = new Label("welcome to NARESHIT");
		Label l2 = new Label("enter username");
		Label l3 = new Label("enter password");
		TextField tf1 = new TextField(15);
		TextField tf2 = new TextField(15);
		tf2.setEchoChar('#');
		Button b1 = new Button("Login");
		Button b2 = new Button("RESET");
		Button b3 = new Button("EXIT");
		Button b4 = new Button("SignUP");
		Label l4 = new Label("enter ADD");
		TextArea ta = new TextArea(5, 15);
		Label l5 = new Label("AVl Cou NIT");
		List lst = new List(4, true);
		lst.add("java");
		lst.add("Python");
		lst.add("c lan");
		lst.add("oracle");
		lst.add("RPA");
		lst.add("php");
		lst.add(".net");
		lst.add("AJS");
		lst.add("AWS");
		lst.add("devAPPS");
		Label l6 = new Label("pay mode");
		Choice c = new Choice();
		c.add("cash");
		c.add("card");
		c.add("upi");
		Label l7 = new Label("FREE FOR NIT STUDENTS");
		Checkbox cb1 = new Checkbox("CRT", true);
		Checkbox cb2 = new Checkbox("HTML", false);
		Checkbox cb3 = new Checkbox("ORACLE");
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox check1 = new Checkbox("java", cbg, true);
		Checkbox check2 = new Checkbox("dbms", cbg, false);
		Checkbox check3 = new Checkbox("se", cbg, false);
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);
		Menu file = new Menu("File");
		MenuItem item1, item2, item3, item4, item5, item6, item7, item8, item9, item10;
		file.add(item1 = new MenuItem("New..."));
		file.add(item2 = new MenuItem("Open..."));
		file.add(item3 = new MenuItem("Close"));
		file.add(item4 = new MenuItem("save"));
		file.add(item5 = new MenuItem("Quit..."));
		mbar.add(file);
		Menu edit = new Menu("EDIT");
		edit.add(item6 = new MenuItem("cut"));
		edit.add(item7 = new MenuItem("copy"));
		edit.add(item8 = new MenuItem("past"));
		edit.add(item9 = new MenuItem("selct"));
		edit.add(item10 = new MenuItem("del"));
		mbar.add(edit);
		add(l1);
		add(l2);
		add(tf1);
		add(l3);
		add(tf2);
		add(l4);
		add(ta);
		add(l5);
		add(lst);
		add(l6);
		add(c);
		add(l7);
		add(cb1);
		add(cb2);
		add(cb3);
		add(check1);
		add(check2);
		add(check3);
		add(b4);
		add(b1);
		add(b2);
		add(b3);
		add(t3);
	}
}

class OurLogin {
	public static void main(String args[]) {
		new Login();
	}
}