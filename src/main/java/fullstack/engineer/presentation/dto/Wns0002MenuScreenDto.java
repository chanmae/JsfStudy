package fullstack.engineer.presentation.dto;

import java.io.Serializable;
import java.util.List;

/**
 * WNS0002メニュー画面の画面出力情報を保持する。<br>
 *
 * @author maeda
 */
//@Named(value = "wns0002MenuScreenDto")
public class Wns0002MenuScreenDto implements Serializable {

	/** 商品一覧 */
	private List<Product> productList;

	/** 商品検索ワード */
	private String itemSearchWord;

	/**
	 * コンストラクタ<br>
	 */
	public Wns0002MenuScreenDto() {
	}

	/**
	 * 商品一覧を取得するメソッド
	 *
	 * @return 商品一覧
	 */
	public List<Product> getProductList() {
		return productList;
	}

	/**
	 * 商品一覧を設定するメソッド
	 *
	 * @param productList
	 */
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	/**
	 * 商品検索ワードを取得するメソッド。
	 *
	 * @return 商品検索ワード
	 */
	public String getItemSearchWord() {
		return itemSearchWord;
	}

	/**
	 * 商品検索ワードを設定するメソッド。
	 *
	 * @param itemSearchWord
	 */
	public void setItemSearchWord(String itemSearchWord) {
		this.itemSearchWord = itemSearchWord;
	}

}
