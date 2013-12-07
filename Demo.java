import java.util.ArrayList;

import javax.swing.JOptionPane;

//This is a demo for github
public class Demo {
	public static void main (String[] args){
		Obj input = new Obj();
		input.addMessage(JOptionPane.showInputDialog("Enter text here"));
		JOptionPane.showMessageDialog(null, input.toString(0));
		input.addMessage(JOptionPane.showInputDialog("Type something else"));
		JOptionPane.showMessageDialog(null, input.toString(0));
		JOptionPane.showMessageDialog(null, "Total number of message objects: " + input.messageCount());
		
	}
}

class Obj{
	ArrayList<String> messages = new ArrayList<String>();
	static int messageCount = 0;
	public Obj(){
	}
	
	public String toString(int pos){
		return messages.get(pos).toString();
	}
	
	public void addMessage (String newMessage){
		messages.add(newMessage);
		messageCount++;
	}
	
	public int messageCount (){
		return messageCount;
	}
	
	
}
