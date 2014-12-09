import javax.swing.*;

public class IconFrame extends JFrame{
	JButton load, save, subscribe, unsubscribe;
	
public IconFrame(){
	super("Icon Frame");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	//create icons
	ImageIcon loadIcon = new ImageIcon("C:/Users/Grand/Desktop/MyJavaFiles/load.gif");
	ImageIcon saveIcon = new ImageIcon("C:/Users/Grand/Desktop/MyJavaFiles/save.gif");
	ImageIcon subscribeIcon = new ImageIcon("C:/Users/Grand/Desktop/MyJavaFiles/subscribe.gif");
	ImageIcon unsubscribeIcon = new ImageIcon("C:/Users/Grand/Desktop/MyJavaFiles/unsubscribe.gif");
	//creat buttons
	load = new JButton("Load", loadIcon);
	save = new JButton("Save", saveIcon);
	subscribe = new JButton("Subscribe", subscribeIcon);
	unsubscribe = new JButton("Unsub", unsubscribeIcon);
	//add buttons to panel
	panel.add(load);
	panel.add(save);
	panel.add(subscribe);
	panel.add(unsubscribe);
	//add the panel to the frame
	add(panel);
	pack();
	setVisible(true);
}	
	
public static void main(String args[])	{
	IconFrame ike = new IconFrame();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
