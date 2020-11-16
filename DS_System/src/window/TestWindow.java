package window;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestWindow {

    public static void main(String[] args) {
    	DataManager.DM.initParameterofDistribution();
    	JFrame jf = new JFrame("概率模拟数生成器");
    	WindowCreate(jf);
    }
    
    
    //窗口生成
    public static void WindowCreate(JFrame jf) {
    	int[] index = {0};
        jf.setSize(450, 370);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        //分布类型
        JLabel label = new JLabel("分布类型：");
        label.setBounds(0, 0, 100, 50);
        panel.add(label);
        //分布名称
        JLabel sublabel = new JLabel("分布名称：");
        sublabel.setBounds(0, 60, 100, 50);
        panel.add(sublabel);
        //参数列表
        JLabel plabel = new JLabel("参数列表：");
        plabel.setBounds(0, 110, 100, 50);
        panel.add(plabel);
        // 创建一个下拉列表框
        final JComboBox<String> comboBox = new JComboBox<String>(DataManager.DM.listData);
        final JComboBox<String> comboBox_kindsOne = new JComboBox<String>(DataManager.DM.kindone);
        final JComboBox<String> comboBox_kindsTwo = new JComboBox<String>(DataManager.DM.kindtwo);
        // 设置默认选中的条目
        comboBox.setSelectedIndex(0);
        comboBox.setBounds(60, 15, 200, 30);
        comboBox_kindsOne.setBounds(60, 75, 200, 30);
        comboBox_kindsTwo.setBounds(60, 75, 200, 30);
        
        //创建参数和自定义文本框
        JLabel pLabel = new JLabel("");
        pLabel.setBounds(60, 120, 400, 30);
        panel.add(pLabel);
        final JTextField textField = new JTextField(8);
        textField.setBounds(60, 160, 330, 30);
        panel.add(textField);
        
        JLabel warnLabel = new JLabel("请确保参数符合要求！");
        warnLabel.setFont(new Font(null, Font.BOLD, 15));
        warnLabel.setBounds(60, 200, 400, 30);
        panel.add(warnLabel);
        
        JLabel numLabel = new JLabel("生成数量:");
        numLabel.setBounds(0, 235, 400, 30);
        panel.add(numLabel);
        
        final JTextField textField_Num = new JTextField(8);
        textField_Num.setBounds(60, 240, 330, 30);
        textField_Num.setFont(new Font(null, Font.PLAIN, 20));
        panel.add(textField_Num);
        // 创建一个按钮，点击后获取文本框中的文本
        final JButton submit_btn = new JButton("提交");
        submit_btn.setFont(new Font(null, Font.PLAIN, 13));
        submit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	//将参数、生成数量、分布类型传给GC
            	//并进行生成
                try {
					GenerateController.GC.Generate(index[0], textField.getText(), textField_Num.getText());
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
            }
        });
        submit_btn.setBounds(60,280, 60, 30);
        panel.add(submit_btn); 
        final JButton exit_btn = new JButton("退出");
        exit_btn.setFont(new Font(null, Font.PLAIN, 13));
        exit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	//将参数、生成数量、分布类型传给GC
            	//并进行生成
                try {
					GenerateController.GC.Generate(index[0], textField.getText(), textField_Num.getText());
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
            }
        });
        exit_btn.setBounds(330,280, 60, 30);
        panel.add(exit_btn); 
        // 添加到内容面板
        panel.add(comboBox);
        panel.add(comboBox_kindsOne);
        comboBox_kindsOne.setVisible(false);
        panel.add(comboBox_kindsTwo);
        comboBox_kindsTwo.setVisible(false);
        
        // 添加条目选中状态改变的监听器
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // 只处理选中的状态
                if (e.getStateChange() == ItemEvent.SELECTED) {
                	if(comboBox.getSelectedIndex() == 0) {
                    	comboBox_kindsOne.setVisible(false);
                    	comboBox_kindsTwo.setVisible(false);
                    }
                    if(comboBox.getSelectedIndex() == 1) {
                    	comboBox_kindsOne.setVisible(true);
                    	comboBox_kindsTwo.setVisible(false);
                    }
                    if(comboBox.getSelectedIndex() == 2) {
                    	comboBox_kindsTwo.setVisible(true);
                    	comboBox_kindsOne.setVisible(false);
                    }
                }
            }
        });
        
        comboBox_kindsOne.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					index[0] = comboBox_kindsOne.getSelectedIndex();
					System.out.println(DataManager.DM.map.get(index[0]));
					pLabel.setText(DataManager.DM.map.get(index[0]));
				}
			}
        });
        
        comboBox_kindsTwo.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					index[0] = comboBox_kindsTwo.getSelectedIndex() + 7;
					pLabel.setText(DataManager.DM.map.get(index[0]));
				}
			}
        });
        jf.setContentPane(panel);
        jf.setVisible(true);
    }

}
