package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Quiz1 {

	public static void main(String[] args) {
		// 화면 생성
		Frame frame = new Frame(); // 프레임 선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);

		// 미리 구현한 클래스로 키이벤트 등록하기
		KeyAdapter adapter = new MyKeyListener();
		frame.addKeyListener(adapter);
		
		// 익명클래스로 키 이벤트 등록하기
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키를 눌렀습니다!");
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
			
		});
	}

}
class MyKeyListener extends KeyAdapter {
	
	@Override
    public void keyPressed(KeyEvent e) {
       System.out.println("키를 눌렀습니다!");
	}
}
