/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullstack.engineer.business.logic;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import fullstack.engineer.business.common.DBConnection;
import fullstack.engineer.business.dto.Wns0002MenuEventInAppView;
import fullstack.engineer.business.dto.Wns0002MenuEventOutAppView;
import fullstack.engineer.business.stub.Product_stub;
import fullstack.engineer.presentation.dto.Product;

/**
 *
 * @author maeda
 */
@ApplicationScoped
public class Wns0002MenuBusinessLogic {

	/** 商品情報（スタブ） */
	@Inject
	Product_stub product_stub;

	/** DBコネクション*/
	@Inject
	DBConnection dBConnection;

	/**
	 * コンストラクタ
	 */
	public Wns0002MenuBusinessLogic() {
		// インスタンス抑止
	}

	/**
	 * WNS0002メニュー画面の表示イベント。<br>
	 * メソッド仕様：WNS0002メニュー画面の表示イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 *
	 * @param wns0002MenuEventAppViewIn
	 * @return wns0002MenuEventAppViewOut
	 */
	public Wns0002MenuEventOutAppView initEventSevrice(Wns0002MenuEventInAppView wns0002MenuEventAppViewIn) {
		// イベントアプリビューOut
		Wns0002MenuEventOutAppView wns0002MenuEventAppViewOut = new Wns0002MenuEventOutAppView();

		// 商品一覧情報
		List<Product> productList = new ArrayList<>();

		dBConnection.getConnection();

		// TODO DB共通部品が実装されるまで、スタブで対応
		productList = product_stub.getProductList();

		wns0002MenuEventAppViewOut.setProductList(productList);

		// 商品一覧DBから商品一覧を取得する
		return wns0002MenuEventAppViewOut;
	}

	/**
	 * WNS0002メニュー画面の商品検索イベント。<br>
	 * メソッド仕様：WNS0002メニュー画面の商品検索イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 *
	 * @param wns0002MenuEventAppViewIn
	 * @return
	 */
	public Wns0002MenuEventOutAppView productSearchEventSevrice(Wns0002MenuEventInAppView wns0002MenuEventAppViewIn) {

		// OutAppView
		Wns0002MenuEventOutAppView wns0002MenuEventAppViewOut = new Wns0002MenuEventOutAppView();

		// TODO DB接続部品呼び出し（課題No.4）
		// 【スタブ】商品情報リスト
		List<Product> productList = new ArrayList<>();
		Product product1=new Product("100", "JavaEEの本", 3000, 10, "大変勉強になります。");
		Product product2=new Product("200", "AWSの本", 4000, 5, "是非ご購入ください。");
		productList.add(product1);
		productList.add(product2);

		//OutAppViewを設定
		wns0002MenuEventAppViewOut.setProductList(productList);

		// 商品一覧DBから商品一覧を取得する
		return wns0002MenuEventAppViewOut;
	}

}
