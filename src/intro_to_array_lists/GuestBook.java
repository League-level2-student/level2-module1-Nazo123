package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	
	ArrayList<String> names = new ArrayList();
	JButton add = new JButton();
	JButton view = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	void run() {
	add.addActionListener(this);
	view.addActionListener(this);
	add.setText("Add A Name");
	view.setText("View The Guest Book");
		panel.add(add);
		panel.add(view);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	int guestNumber;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(add)) {
			guestNumber = names.size()+1;
			names.add("\n"+"Guest #"+guestNumber+": "+JOptionPane.showInputDialog("Add A Name To The Guest Book!"));
		}
		else if(e.getSource().equals(view)){

	
			
			JOptionPane.showMessageDialog(null, names);
		
	}
	}}
	
