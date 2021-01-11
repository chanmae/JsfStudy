/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullstack.engineer.business.logic;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import fullstack.engineer.business.common.DBConnection;
import fullstack.engineer.business.dto.Wns0001LoginEventInAppView;
import fullstack.engineer.business.dto.Wns0001LoginEventOutAppView;
import fullstack.engineer.business.stub.Product_stub;
import fullstack.engineer.presentation.dto.UserInformation;

/**
 *
 * @author maeda
 */
@ApplicationScoped
public class Wns0001LoginBusinessLogic {

	/** 商品情報（スタブ） */
	@Inject
	Product_stub product_stub;

	/** DBコネクション*/
	@Inject
	DBConnection dBConnection;

	/**
	 * コンストラクタ
	 */
	public Wns0001LoginBusinessLogic() {
		// インスタンス抑止
	}

	/**
	 * WNS0001ログイン画面の表示イベント。<br>
	 * メソッド仕様：WNS0001ログイン画面の表示イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 *
	 * @param wns0001LoginEventAppViewIn
	 * @return wns0001LoginEventAppViewOut
	 */
	public Wns0001LoginEventOutAppView initEventSevrice(Wns0001LoginEventInAppView wns0001LoginEventAppViewIn) {
		// イベントアプリビューOut
		Wns0001LoginEventOutAppView wns0001LoginEventAppViewOut = new Wns0001LoginEventOutAppView();

		// ユーザ情報
		UserInformation userInformation = new UserInformation();

		// DB接続
		// TODO DB接続時エラー発生となる（課題管理No.4）
//		dBConnection.getConnection();


		// Outアプリビューにユーザー情報を設定する。
//		wns0001LoginEventAppViewOut.setUserInformation(userInformation);

		return wns0001LoginEventAppViewOut;
	}

	/**
	 * WNS0001ログイン画面の商品検索イベント。<br>
	 * メソッド仕様：WNS0001ログイン画面の商品検索イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 *
	 * @param wns0001LoginEventAppViewIn
	 * @return
	 */
	public Wns0001LoginEventOutAppView productSearchEventSevrice(Wns0001LoginEventInAppView wns0001LoginEventAppViewIn) {
		// イベントアプリビューOut
		Wns0001LoginEventOutAppView wns0001LoginEventAppViewOut = new Wns0001LoginEventOutAppView();

		// DB接続部品呼び出し

		// 商品一覧DBから商品一覧を取得する
		return wns0001LoginEventAppViewOut;
	}

}
