import java.awt.event.*;

import javax.swing.*;

public class notesapp extends JFrame{

 

    private JButton addB;

    private JButton deleteB;

    private JTextArea textArea;

    private JTextArea notesArea;

 

    public notesapp(){

        addB = new JButton("+");

        deleteB = new JButton("-");

        textArea = new JTextArea();

        notesArea = new JTextArea();

 

        setTitle("Notes App");

        setSize(600, 600);

        setLayout(null);  // Using null layout to manually position components

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 

        textArea.setBounds(10,520,530,30);

        addB.setBounds(550,520,30,30);

        notesArea.setBounds(10,10,530,500);

        deleteB.setBounds(550,10,30,30);

 

        ActionListener act = new ActionListener(){

            @Override

            public void actionPerformed(ActionEvent e){

                addNote();

            }

        };

 

        addB.addActionListener(act);

        deleteB.addActionListener(e -> deleteNote());

        add(addB);

        add(deleteB);

        add(textArea);

        add(notesArea);

    }

 

    public static void main(String[] args){

        new notesapp();

    }

 

    public void addNote(){

        notesArea.append(textArea.getText() + "\n");

        textArea.setText("");

    }

 

    public void deleteNote(){

        notesArea.setText("");

    }

}

