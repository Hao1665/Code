import java.awt.Frame;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class AWT{
    public static void main(String[]args){
        Frame frame = new Frame();
        frame.setTitle("���Ǳ���");//���ô��ڱ���
        frame.setSize(500,300);//���ô��ڴ�С
		frame.setBackground(Color.RED);
        frame.setResizable(false);//���ô��ڴ�С�Ƿ�̶�
        frame.setAlwaysOnTop(true);//���ô����Ƿ�ʼ��չʾ����ǰ��
        frame.setVisible(true);//���ô��ڿɼ���
		
		frame.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	
    }
}