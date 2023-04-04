package num1.ui;

import javax.swing.*;
import java.awt.*;

public class RegisterJFrame extends JFrame {
    //注册界面

    public RegisterJFrame(){
        this.setSize(488,500);
        this.setTitle("注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

        this.setVisible(true);
    }
}
