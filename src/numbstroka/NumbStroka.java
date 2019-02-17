package numbstroka;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

public class NumbStroka extends JFrame {

    public NumbStroka() {
        JFrame okno = new JFrame();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEADING));

        JLabel labelt_chislo = new JLabel("Число");
        JTextField chislo = new JTextField(15);

        container.add(labelt_chislo);
        container.add(chislo);
        chislo.setSize(100, 100);

        PlainDocument doc = (PlainDocument) chislo.getDocument();
        doc.setDocumentFilter(new Filter());

        JLabel labelt_stroka = new JLabel("Строка");
        JTextField stroka = new JTextField(15);
        container.add(labelt_stroka);
        container.add(stroka);
        stroka.setSize(100, 100);

        Box box1 = Box.createVerticalBox();

        box1.setBorder(new TitledBorder(""));
        container.add(box1);

        JButton b_add = new JButton("Добавить");
        box1.add(b_add);
        box1.add(Box.createVerticalStrut(10));

        JButton b_showall = new JButton("Вывести всё");
        box1.add(b_showall);
        box1.add(Box.createVerticalStrut(10));

        JButton b_showchislo = new JButton("Вывести только числа");
        box1.add(b_showchislo);
        box1.add(Box.createVerticalStrut(10));

        JButton b_showstroka = new JButton("Вывести только строку");
        box1.add(b_showstroka);
        box1.add(Box.createVerticalStrut(10));

        JTextArea textarea = new JTextArea("", 40, 50);
        container.add(textarea);
        textarea.setLineWrap(true);

        ArrayList list = new ArrayList();

    
      
        b_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                if (stroka.getText().length() == 0) {

                    JOptionPane.showMessageDialog(NumbStroka.this, "Введите данные в поле Строка!");

                } else if (stroka.getText().length()!= 0) {
                              String input_chislo;
                              String input_stroka;
                              input_chislo = chislo.getText();
                              input_stroka = stroka.getText();
                   
                    
                  for (int i = 0; i < list.size(); i++) {
                        list.add(input_chislo);
                        list.add(input_stroka);
                       }
                  
                        chislo.setText("");
                        stroka.setText("");                        
                }
            }});
            
        b_showall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                if (stroka.getText().length() == 0) {

                    JOptionPane.showMessageDialog(NumbStroka.this, "Введите данные в поле Строка!");

                } else if (stroka.getText().length()!= 0) {
                              String input_chislo;
                              String input_stroka;
                              input_chislo = chislo.getText();
                              input_stroka = stroka.getText();
                   
                    
                  for (int i = 0; i < list.size(); i++) {
                        list.add(input_chislo);
                        list.add(input_stroka);
                       }
                  
                        chislo.setText("");
                        stroka.setText("");
                        textarea.append("\nЧисло: " + input_chislo + "\nCтрока: " + input_stroka);
                }
            }});
        
        
        b_showchislo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                if (stroka.getText().length() == 0) {

                    

                } else if (stroka.getText().length()!= 0) {
                              String input_chislo;
                              String input_stroka;
                              input_chislo = chislo.getText();
                              input_stroka = stroka.getText();
                   
                    
                  for (int i = 0; i < list.size(); i++) {
                        list.add(input_chislo);
                        list.add(input_stroka);
                       }
                  
                        chislo.setText("");
                        stroka.setText("");
                        textarea.append("\nЧисло: " + input_chislo);
                }
            }});
        
        
                b_showstroka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                if (stroka.getText().length() == 0) {

                    JOptionPane.showMessageDialog(NumbStroka.this, "Введите данные в поле Строка!");

                } else if (stroka.getText().length()!= 0) {
                              String input_chislo;
                              String input_stroka;
                              input_chislo = chislo.getText();
                              input_stroka = stroka.getText();
                   
                    
                  for (int i = 0; i < list.size(); i++) {
                        list.add(input_chislo);
                        list.add(input_stroka);
                       }
                  
                        chislo.setText("");
                        stroka.setText("");
                        textarea.append("\nCтрока: " + input_stroka);
                }
            }});
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumbStroka okno = new NumbStroka();
        okno.pack();
        okno.setLocationRelativeTo(null);
        okno.setVisible(true);
        okno.setSize(700, 900);
        okno.setTitle("Programm Number_word");
    }

    class Filter extends DocumentFilter {

        @Override
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string,
                AttributeSet attr) throws BadLocationException {
            if (string.matches("-?\\d+")) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text,
                AttributeSet attrs) throws BadLocationException {
            if (text.matches("-?\\d+")) {
                super.replace(fb, offset, length, text, attrs);
            }
        }
    }

}
