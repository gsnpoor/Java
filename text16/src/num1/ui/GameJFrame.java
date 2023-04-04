package num1.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //主界面
    int[][] data = new int[4][4];
    int x = 0;
    int y = 0;
    Random rr = new Random();
    String local = "animal";
    String path = "text16\\image\\animal\\animal3\\";

    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {12, 14, 15, 0}
    };

    int step = 0;

    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登陆");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    public GameJFrame() {
        //初始化界面
        initJFrame();
        //初始化菜单
        initJMenuBar();
        //初始化数据（打乱）
        initData();
        //初始化图片
        initImage();


        this.setVisible(true);
    }

    //初始化数据（打乱）
    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片
    private void initImage() {
        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("D:\\development\\program\\program1\\text16\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = data[i][j];
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));

                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //添加图片边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));

                //this.add(jLabel);
                this.getContentPane().add(jLabel);

            }
        }
        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("text16\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        //刷新一下界面
        this.getContentPane().repaint();
    }


    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu functionMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu changeMenu = new JMenu("更换图片");


        //将每一个选项下的条目添加到选项中
        functionMenu.add(changeMenu);
        functionMenu.add(replayItem);
        functionMenu.add(reLoginItem);
        functionMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        changeMenu.add(girl);
        changeMenu.add(animal);
        changeMenu.add(sport);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);

        //将菜单中的两个选项添加到菜单中
        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图单机版");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中位置
        this.setLayout(null);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下按键不松时调用
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("text16\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);

            //刷新一下界面
            this.getContentPane().repaint();
        }
    }

    //松开按键时调用
    @Override
    public void keyReleased(KeyEvent e) {
        //判断是否胜利，如果胜利直接结束
        if (victory()) {
            return;
        }

        int code = e.getKeyCode();
        if (code == 37) {
            //向左移动
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 38) {
            //向上移动
            if (x == 3) {
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();

        } else if (code == 39) {
            //向右移动
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 40) {
            //向下移动
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {12, 14, 15, 0}
            };
            initImage();
        }
    }

    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem) {
            //重新游戏
            step = 0;
            initData();
            initImage();

        } else if (obj == girl) {
            System.out.println("1111");
            path = "text16\\image\\girl\\girl" + rr.nextInt(1, 13) + "\\";
            step = 0;
            initData();
            initImage();
        } else if (obj == animal) {
            path = "text16\\image\\animal\\animal" + rr.nextInt(1, 8) + "\\";
            step = 0;
            initData();
            initImage();
        } else if (obj == sport) {
            path = "text16\\image\\sport\\sport" + rr.nextInt(1, 10) + "\\";
            step = 0;
            initData();
            initImage();
        } else if (obj == reLoginItem) {
            //重新登陆
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == closeItem) {
            //关闭游戏
            System.exit(0);
        } else if (obj == accountItem) {
            //公众号
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("text16\\image\\about.png"));
            jLabel.setBounds(0, 0, 258, 258);
            //把图片添加到弹窗中
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344, 344);
            //让弹窗置顶
            jDialog.setAlwaysOnTop(true);
            //让弹窗居中
            jDialog.setLocationRelativeTo(null);
            //弹窗不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹窗显示出来
            jDialog.setVisible(true);
        }

    }
}