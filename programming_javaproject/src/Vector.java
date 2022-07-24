// BufferedReader
import java.io.*;
//Vectorクラス
public class Vector {
    //ベクトルのx,y成分
    public double x, y;
    //成分入力関数
    public void input() {
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
            //成分入力
            try {
                //x成分入力
                System.out.print("x: ");
                x = Double.valueOf(d.readLine()).doubleValue();
                //y成分入力
                System.out.print("y: ");
                y = Double.valueOf(d.readLine()).doubleValue();
            }
            //入力エラー処理
            catch(IOException e) {
            System.out.println("IO Error");
            System.exit(1);
        }
    }
    //成分出力関数
    public void output() {
        System.out.printf("(%6.2f, %6.2f)%n", x, y);
    }
    //内積を求める関数
    public double inner(Vector v) {
        return x * v.x + y * v.y;
    }
    //外積を求める関数
    public double exterior(Vector v) {
        return x * v.y - y * v.x;
    }
}