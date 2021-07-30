import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
	
	ship = new ship(new InputStreamReader(System.in));
	int cx = (int)(Math.random()*10);
	int cy = (int)(Math.random()*10);

	boolean hit = false;

	for(int count = 0; count < 10; count++){
	    System.out.println("砲撃のx座標を入力してください。(0-9)");
	    int bx = Integer.parseInt(buf.readLine());

	    System.out.println("砲撃のy座標を入力してください。(0-9)");
	    int by = Integer.parseInt(buf.readLine());

	    System.out.println("砲撃回数"+(count+1));

	   
	    if((bx == cx) && (by == cy)){
		System.out.println("砲撃(" + bx + "," + by + ")は命中！");
		System.out.println("相手の潜水艦を撃沈しました。");
		hit = true; 
		break;
	    }

	    System.out.println("砲撃(" + bx + "," + by + ")は外れました・・・");
	    int error = Math.abs(bx-cx) + Math.abs(by-cy);
	    System.out.println("相手潜水艦との誤差は" + error);

	}

	if(hit == false){
	    System.out.println("相手の攻撃が当たりました。");
	}

    }
}
