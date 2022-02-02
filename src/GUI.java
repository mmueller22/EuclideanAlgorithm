import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{

    private JTextField numberOneInput;
	private JTextField numberTwoInput;
	private JLabel output;

    public GUI(String applicationName, int width, int height) {
        setTitle(applicationName);
        setBounds(500, 500, width, height);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
		panel.setBounds(500, 500, width, height);
		panel.setLayout(null);
		add(panel);

        JLabel title = new JLabel("Euclidean Algorithm");
        JLabel numberOne = new JLabel("1. number:");
		JLabel numberTwo = new JLabel("2. number:");
		numberOneInput = new JTextField();
		numberTwoInput = new JTextField();
		JButton calculate = new JButton("Calculate");
		output = new JLabel();

        title.setBounds			(48, 10,  400, 50);
		numberOne.setBounds		(48, 50,  100, 50);
		numberOneInput.setBounds(130,62,  100, 25);
		numberTwo.setBounds		(48, 80, 100, 50);
		numberTwoInput.setBounds(130,92, 100, 25);
		calculate.setBounds		(40, 130, 120, 25);
		output.setBounds		(48, 150, 800, 50);
		
		panel.add(title);
		panel.add(numberOne);
		panel.add(numberOneInput);
		panel.add(numberTwo);
		panel.add(numberTwoInput);
		panel.add(calculate);
		panel.add(output);
		
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculation calc = new Calculation(Integer.parseInt(numberOneInput.getText()), Integer.parseInt(numberTwoInput.getText()));
                output.setText(String.format("The greatest common divisor is %d", calc.getGcd()));
			}
		});
    }
    public static void main(String[] args) {
        new GUI("Euclidean algorithm", 500, 500).setVisible(true);
    }
}