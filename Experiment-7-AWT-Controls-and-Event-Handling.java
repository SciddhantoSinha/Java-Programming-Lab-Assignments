import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    Frame f;
    Panel p;
    TextField tf;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button bAdd,bSub,bMul,bDiv,bEq,bClr;

    int num1, num2, result;
    char operator;

    Calculator() {

        f = new Frame("My Calculator");
        tf = new TextField(20);

        p = new Panel();
        p.setLayout(new GridLayout(4, 4, 10, 10));

        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");

        bAdd = new Button("+");
        bSub = new Button("-");
        bMul = new Button("*");
        bDiv = new Button("/");
        bEq  = new Button("=");
        bClr = new Button("C");

        Button[] buttons = {b1,b2,b3,bAdd,b4,b5,b6,bSub,
                            b7,b8,b9,bMul,b0,bClr,bEq,bDiv};

        for(Button b : buttons) {
            b.addActionListener(this);
            p.add(b);
        }

        f.setLayout(new FlowLayout());
        f.add(tf);
        f.add(p);

        f.setSize(300, 350);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String cmd = e.getActionCommand();

        if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9') {
            tf.setText(tf.getText() + cmd);
        }

        else if (cmd.equals("+")) {
            num1 = Integer.parseInt(tf.getText());
            operator = '+';
            tf.setText("");
        }

        else if (cmd.equals("-")) {
            num1 = Integer.parseInt(tf.getText());
            operator = '-';
            tf.setText("");
        }

        else if (cmd.equals("*")) {
            num1 = Integer.parseInt(tf.getText());
            operator = '*';
            tf.setText("");
        }

        else if (cmd.equals("/")) {
            num1 = Integer.parseInt(tf.getText());
            operator = '/';
            tf.setText("");
        }

        else if (cmd.equals("=")) {
            num2 = Integer.parseInt(tf.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else {
                        tf.setText("Infinite");
                        return;
                    }
            }
            tf.setText(String.valueOf(result));
        }

        else if (cmd.equals("C")) {
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
