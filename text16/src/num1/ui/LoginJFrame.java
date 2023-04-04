package num1.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //登录界面
    public LoginJFrame(){
        this.setSize(488,430);
        this.setTitle("登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

        this.setVisible(true);
    }
}
