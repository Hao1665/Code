import java.awt.Frame;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class AWT{
    public static void main(String[]args){
        Frame frame = new Frame();
        frame.setTitle("我是标题");//设置窗口标题
        frame.setSize(500,300);//设置窗口大小
		frame.setBackground(Color.RED);
        frame.setResizable(false);//设置窗口大小是否固定
        frame.setAlwaysOnTop(true);//设置窗口是否始终展示在最前面
        frame.setVisible(true);//设置窗口可见性
		
		frame.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	
    }
}