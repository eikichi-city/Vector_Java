//Productクラス
public class Product {
    public static void main(String[] args) {
        //２つのベクトルを生成
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        //成分入力
        v1.input();
        v2.input();
        //成分出力
        v1.output();
        v2.output();
        //内積を求めて表示
        double inner = v1.inner(v2);
        System.out.println("inner_product = " + inner);
        //外積を求めて表示
        double exterior = v1.exterior(v2);
        System.out.println("exterior_product = " + exterior);
    }
}