package fullstack.engineer.presentation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import fullstack.engineer.presentation.common.constant.FormDataConst;

/**
 * WNS0004_商品購入確認画面のイベント処理を行う。<br>
 *
 * @author maeda
 */
@Named(value = "wns0004ProductPurchaseConfirmationBean")
@ViewScoped
public class Wns0004ProductPurchaseConfirmationBean implements Serializable {

	/**
	 * コンストラクタ。<br>
	 */
	public Wns0004ProductPurchaseConfirmationBean() {
	}

	/**
	 * 【表示】イベント。<br>
	 * メソッド仕様：表示イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	@PostConstruct
	public void init() {
	}

	/**
	 * 【メニュー画面へ】イベント。<br>
	 * メソッド仕様：メニュー画面へイベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	public String toMenu() {

		// WNS0002_メニュー画面へ遷移する。
		return FormDataConst.SCREEN_URL_WNS0002_MENU;
	}

}
