package gui;
import java.awt.*;
import javax.swing.*;
public class ChatClient {
    private JTextArea output;
    private JTextField input;
    private JButton send;
    private JButton quit;
    public ChatClient(){
        output = new JTextArea(10,50);
        input = new JTextField(50);
        send = new JButton("send");
        quit = new JButton("quit");
    }
    public void launchFrame(){
        JFrame f = new JFrame("Chat Room");
        f.setLayout(new BorderLayout());
        f.add(output, BorderLayout.WEST);
        f.add(input, BorderLayout.SOUTH);
        Panel pan = new Panel();
        pan.setLayout(new GridLayout(2,1));
        pan.add(send);
        pan.add(quit);
        f.add(pan, BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args){
        ChatClient chat = new ChatClient();
        chat.launchFrame();
    }
}


