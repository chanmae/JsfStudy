package fullstack.engineer.business.stub;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import fullstack.engineer.presentation.dto.Product;

/**
 * 商品一覧情報（スタブ）を保持する。<br>
 * 注意事項：なし。<br>
 *
 * @author maeda
 *
 */

@ApplicationScoped
public class Product_stub {

	/** 商品情報（スタブ) */
	List<Product> productList = new ArrayList<>();

	/**
	 * コンストラクタ。<br>
	 * メソッド仕様：商品一覧テーブルの情報を設定する。<br>
	 * 注意事項：商品一覧情報のスタブ。<br>
	 */
	public Product_stub() {

		// 【スタブ】初期表示用
		productList.add(new Product("001", "AWS入門", 3980, 100, "AWSの基礎を学習できます。"));
		productList.add(new Product("002", "Linux入門", 3800, 10, "Linuxの基礎を学習できます。"));
		productList.add(new Product("003", "Git入門", 2980, 30, "Gitの基礎を学習できます。"));
	}

	/**
	 * 商品情報（スタブ）取得メソッド
	 *
	 * @return 商品情報（スタブ）
	 */
	public List<Product> getProductList() {
		return productList;
	}
}
