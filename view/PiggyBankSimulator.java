package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

public class PiggyBankSimulator {

    private JFrame window;
    private JTextArea display = new JTextArea();
    private JRadioButton[] radioButtons;

    public PiggyBankSimulator(JFrame window)
    {
        this.window = window;
        window.setTitle("PiggyBank Simulator");
    }

    public void init()
    {
        Container cp = window.getContentPane();

        var scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED 
            ,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(500 , 500));

        cp.add(BorderLayout.CENTER, scrollPane);

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2, 1));
        cp.add(BorderLayout.SOUTH, southPanel);

        radioButtons = new JRadioButton[3];
        radioButtons[0] = new JRadioButton("Nickel");
        radioButtons[0].setSelected(true);
        radioButtons[1] = new JRadioButton("Dime");
        radioButtons[2] = new JRadioButton("Quarter");

        JPanel radioPanel = new JPanel();
        ButtonGroup radioGroup = new ButtonGroup();
        for(var b: radioButtons)
        {
            radioPanel.add(b);
            radioGroup.add(b);
        }
        southPanel.add(radioPanel);

        var insertButton = new JButton("Insert");
        var historyButton = new JButton("History");
        var statsButton = new JButton("Stats");
        var exitButton = new JButton("Exit");
        
        JPanel buttonPanel = new JPanel();
        southPanel.add(buttonPanel);
        buttonPanel.add(insertButton);
        buttonPanel.add(historyButton);
        buttonPanel.add(statsButton);
        buttonPanel.add(exitButton);


    }
    
}
