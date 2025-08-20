package com.gqt.corejava.Quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizSwings extends JFrame implements ActionListener {

    String[] ques = {
        "Which language is used for Android app development?",
        "What is the time complexity of binary search?",
        "Who discovered the theory of general relativity?",
        "Which keyword is used to inherit a class in Java?",
        "What is the capital of Australia?",
        "Which method is used to start a thread in Java?",
        "Which HTML tag is used to create a hyperlink?",
        "Who is known as the father of computers?",
        "What is the output of 2 + 3 * 4 in Java?",
        "Which data structure uses FIFO (First In First Out)?"
    };

    String[][] options = {
        {"Java", "Python", "Swift", "Kotlin"},
        {"O(n)", "O(log n)", "O(n log n)", "O(1)"},
        {"Newton", "Tesla", "Einstein", "Bohr"},
        {"implements", "extends", "super", "import"},
        {"Sydney", "Melbourne", "Canberra", "Perth"},
        {"run()", "start()", "begin()", "execute()"},
        {"<div>", "<a>", "<p>", "<link>"},
        {"Thomas Edison", "Charles Babbage", "Alan Turing", "Dennis Ritchie"},
        {"20", "14", "10", "17"},
        {"Stack", "Queue", "Tree", "Graph"}
    };

    String[] correct = {"D", "B", "C", "B", "C", "B", "B", "B", "B", "B"};

    String[][] options5050 = {
        {"Java", "Kotlin"},
        {"O(n)", "O(log n)"},
        {"Tesla", "Einstein"},
        {"implements", "extends"},
        {"Melbourne", "Canberra"},
        {"run()", "start()"},
        {"<a>", "<link>"},
        {"Charles Babbage", "Alan Turing"},
        {"14", "10"},
        {"Stack", "Queue"}
    };
    JLabel questionLabel, scoreLabel, nameLabel;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup optionsGroup;
    JButton nextBtn, quitBtn, lifeline5050Btn, audiencePollBtn;

    int current = 0, score = 0;
    boolean used5050 = false, usedAP = false;

    String playerName;

    public QuizSwings(String name) {
        this.playerName = name;

        setTitle("Quiz Game - Swing Version");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel topPanel = new JPanel(new BorderLayout());
        nameLabel = new JLabel("Player: " + playerName);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 18));
        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 18));
        scoreLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        topPanel.add(nameLabel, BorderLayout.WEST);
        topPanel.add(scoreLabel, BorderLayout.EAST);
        add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(5, 1, 5, 5));
        questionLabel = new JLabel("Question will appear here");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        centerPanel.add(questionLabel);

        opt1 = new JRadioButton();
        opt2 = new JRadioButton();
        opt3 = new JRadioButton();
        opt4 = new JRadioButton();

        optionsGroup = new ButtonGroup();
        optionsGroup.add(opt1);
        optionsGroup.add(opt2);
        optionsGroup.add(opt3);
        optionsGroup.add(opt4);

        centerPanel.add(opt1);
        centerPanel.add(opt2);
        centerPanel.add(opt3);
        centerPanel.add(opt4);

        add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        nextBtn = new JButton("Next");
        quitBtn = new JButton("Quit");
        lifeline5050Btn = new JButton("50-50");
        audiencePollBtn = new JButton("Audience Poll");

        nextBtn.addActionListener(this);
        quitBtn.addActionListener(this);
        lifeline5050Btn.addActionListener(this);
        audiencePollBtn.addActionListener(this);

        bottomPanel.add(lifeline5050Btn);
        bottomPanel.add(audiencePollBtn);
        bottomPanel.add(nextBtn);
        bottomPanel.add(quitBtn);

        add(bottomPanel, BorderLayout.SOUTH);

        loadQuestion(current);
        setVisible(true);
    }

    private void loadQuestion(int qIndex) {
        questionLabel.setText("Q" + (qIndex + 1) + ". " + ques[qIndex]);
        opt1.setText("A. " + options[qIndex][0]);
        opt2.setText("B. " + options[qIndex][1]);
        opt3.setText("C. " + options[qIndex][2]);
        opt4.setText("D. " + options[qIndex][3]);
        opt1.setVisible(true);
        opt2.setVisible(true);
        opt3.setVisible(true);
        opt4.setVisible(true);
        optionsGroup.clearSelection();
    }

    private String getSelectedOption() {
        if (opt1.isSelected()) return "A";
        if (opt2.isSelected()) return "B";
        if (opt3.isSelected()) return "C";
        if (opt4.isSelected()) return "D";
        return "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextBtn) {
            String selected = getSelectedOption();
            if (selected.equals("")) {
                JOptionPane.showMessageDialog(this, "Please select an option!");
                return;
            }
            if (selected.equalsIgnoreCase(correct[current])) {
                score += 10000;
                scoreLabel.setText("Score: " + score);
                JOptionPane.showMessageDialog(this, "Correct Answer!");
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Answer! Correct: " + correct[current]);
                JOptionPane.showMessageDialog(this, "Game Over! Final Score: " + score);
                System.exit(0);
            }
            current++;
            if (current < ques.length) {
                loadQuestion(current);
            } else {
                JOptionPane.showMessageDialog(this, "Quiz Over! Final Score: " + score);
                System.exit(0);
            }
        }

        if (e.getSource() == quitBtn) {
            JOptionPane.showMessageDialog(this, "You quit! Final Score: " + score);
            System.exit(0);
        }

        if (e.getSource() == lifeline5050Btn && !used5050) {
            used5050 = true;
            String[] remain = options5050[current];
            opt1.setVisible(false);
            opt2.setVisible(false);
            opt3.setVisible(false);
            opt4.setVisible(false);

            if (remain[0].equals(options[current][0]) || remain[1].equals(options[current][0])) opt1.setVisible(true);
            if (remain[0].equals(options[current][1]) || remain[1].equals(options[current][1])) opt2.setVisible(true);
            if (remain[0].equals(options[current][2]) || remain[1].equals(options[current][2])) opt3.setVisible(true);
            if (remain[0].equals(options[current][3]) || remain[1].equals(options[current][3])) opt4.setVisible(true);

            lifeline5050Btn.setEnabled(false);
        }

        if (e.getSource() == audiencePollBtn && !usedAP) {
            usedAP = true;
            JOptionPane.showMessageDialog(this, 
                "Audience suggests option: " + correct[current], 
                "Audience Poll", JOptionPane.INFORMATION_MESSAGE);
            audiencePollBtn.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame startFrame = new JFrame("Welcome to Quiz Game");
            startFrame.setSize(500, 400);
            startFrame.setLocationRelativeTo(null);
            startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            startFrame.setLayout(new BorderLayout(10, 10));

            JLabel title = new JLabel("Welcome to the Quiz Game!", JLabel.CENTER);
            title.setFont(new Font("Arial", Font.BOLD, 20));
            startFrame.add(title, BorderLayout.NORTH);

            JTextArea rules = new JTextArea(
                "Rules:\n" +
                "1. If you know the answer, select it directly.\n" +
                "2. If you don't know, you can use lifelines (once each).\n" +
                "3. If you don't know and no lifelines left, you can quit.\n" +
                "4. Each correct answer gives Rs. 10,000.\n" +
                "5. Wrong answer ends the game immediately.\n"
            );
            rules.setFont(new Font("Arial", Font.PLAIN, 14));
            rules.setEditable(false);
            startFrame.add(new JScrollPane(rules), BorderLayout.CENTER);

            JPanel inputPanel = new JPanel(new FlowLayout());
            inputPanel.add(new JLabel("Enter your name: "));
            JTextField nameField = new JTextField(20);
            inputPanel.add(nameField);
            JButton startBtn = new JButton("Start Quiz");
            inputPanel.add(startBtn);

            startFrame.add(inputPanel, BorderLayout.SOUTH);

            startBtn.addActionListener(ev -> {
                String name = nameField.getText().trim();
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(startFrame, "Please enter your name!");
                } else {
                    startFrame.dispose();
                    new QuizSwings(name);
                }
            });

            startFrame.setVisible(true);
        });
    }
}
