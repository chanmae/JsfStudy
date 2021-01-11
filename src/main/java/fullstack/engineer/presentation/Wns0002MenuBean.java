package fullstack.engineer.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fullstack.engineer.business.dto.Wns0002MenuEventInAppView;
import fullstack.engineer.business.dto.Wns0002MenuEventOutAppView;
import fullstack.engineer.business.facade.Wns0002MenuBusinessFacade;
import fullstack.engineer.presentation.common.constant.FormDataConst;
import fullstack.engineer.presentation.common.util.Wns0002MenuEditScreenDto;
import fullstack.engineer.presentation.dto.InterScreenSharedData;
import fullstack.engineer.presentation.dto.Product;
import fullstack.engineer.presentation.dto.Wns0002MenuScreenDto;

/**
 * WNS0002_メニュー画面のイベント処理を行う。<br>
 *
 * @author maeda
 */
@Named(value = "wns0002MenuBean")
//@ManagedBean(value="wns0002MenuBean")
@ViewScoped
public class Wns0002MenuBean implements Serializable {

	/** 画面間共有データ */
	@Inject
	private InterScreenSharedData interScreenSharedData;

	/** WNS0002メニュー画面DTO */
	private Wns0002MenuScreenDto wns0002MenuScreenDto;

	/** WNS0002メニュー画面イベントサービス */
	@Inject
	Wns0002MenuBusinessFacade wns0002BusinessFacade;

	/** FacesContext */
	FacesContext facesContext;

	/**
	 * コンストラクタ。<br>
	 */
	public Wns0002MenuBean() {
	}

	/**
	 * 【表示】イベント。<br>
	 * メソッド仕様：表示イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	@PostConstruct
	public void init() {

		// リクエスト情報マップ
		Map<String, String> params = new HashMap<>();
		// リクエストスコープで管理されている情報をMapで取得
		params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

		// InAppView
		Wns0002MenuEventInAppView wns0002MenuEventInAppView = new Wns0002MenuEventInAppView();
		// OutAppView
		Wns0002MenuEventOutAppView wns0002MenuEventOutAppView = new Wns0002MenuEventOutAppView();

		// 表示イベントサービス呼び出し
		wns0002MenuEventOutAppView = wns0002BusinessFacade.initEventSevrice(wns0002MenuEventInAppView);

		// 画面DTOがnullの場合、インスタンスを生成する
		if (Objects.isNull(wns0002MenuScreenDto)) {
			wns0002MenuScreenDto = new Wns0002MenuScreenDto();
		}

		// OutAppViewから画面DTOへ移送
		Wns0002MenuEditScreenDto.editScreenDto(wns0002MenuScreenDto, wns0002MenuEventOutAppView);

	}

	/**
	 * 【商品検索】イベント。<br>
	 * メソッド仕様：商品検索イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	public void productSearch() {

		// リクエスト情報マップ
		Map<String, String> params = new HashMap<>();
		// リクエストスコープで管理されている情報をMapで取得
		params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

		// InAppView
		Wns0002MenuEventInAppView wns0002MenuEventAppViewIn = new Wns0002MenuEventInAppView();
		// OUtAppView
		Wns0002MenuEventOutAppView wns0002MenuEventOutAppView = new Wns0002MenuEventOutAppView();

		// 商品検索ワードを取得
		String productSearchText = params.get(FormDataConst.PRODUCT_SEARCH_FORM + FormDataConst.PRODUCT_SEARCH_WORD);
		// InAppViewに商品検索ワードを設定
		wns0002MenuEventAppViewIn.setProductSearchtext(productSearchText);

		// 商品検索イベントサービス呼び出し
		wns0002MenuEventOutAppView = wns0002BusinessFacade.productSearchEventSevrice(wns0002MenuEventAppViewIn);

		// BLで取得した内容を画面DTOへ移送する。
		Wns0002MenuEditScreenDto.editScreenDto(wns0002MenuScreenDto, wns0002MenuEventOutAppView);
	}

	/**
	 * 【買い物かごに追加】イベント。<br>
	 * メソッド仕様：買い物かごに追加イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	public void AddToShoppingCart() {

		// リクエスト情報マップ
		Map<String, String> params = new HashMap<>();
		// リクエストスコープで管理されている情報をMapで取得
		params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

		// 買い物かごに追加する商品情報の取得
		// TODO 未実装（実装方法検討中 課題No.14）

		//購入商品リスト（買い物かご）
		List<Product> purchasedProductList = new ArrayList<>();

		// 画面表示されている商品数分繰り返す
		for (int i = 0; i < wns0002MenuScreenDto.getProductList().size(); i++) {
			Product wkProduct = wns0002MenuScreenDto.getProductList().get(i);
			// 商品の購入チェックフラグがONの場合
			if ("on".equals(params.get("menuform:productlist:" + String.valueOf(i) + ":purchasecheck"))) {
				// 画面DTO.商品一覧.購入数
				wkProduct.setPurchaseNumber(
						Integer.parseInt(params.get("menuform:productlist:" + String.valueOf(i) + ":purchaseNumber")));
				// 画面DTO.商品一覧.購入チェックフラグ
				wkProduct.setPurchaseCheckFlag(true);
				//購入商品リスト（買い物かご）に追加
				purchasedProductList.add(wkProduct);
			}
		}
		// 画面間共有データ.購入商品リスト（買い物かご）
		interScreenSharedData.setPurchasedProductList(purchasedProductList);
	}

	/**
	 * 【商品購入へ】イベント。<br>
	 * メソッド仕様：商品購入へイベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	public String toPurchaseProducts() {

		// TODO 未実装
		// WNS0003_商品購入画面に遷移する。
		return FormDataConst.SCREEN_URL_WNS0003_LOGIN;
	}

	/**
	 * 【購入履歴確認へ】イベント。<br>
	 * メソッド仕様：購入履歴確認へイベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	public String toPurchaseHistoryConfirmation() {

		// TODO 未実装
		return FormDataConst.SCREEN_URL_WNS0005_PURCHASE_HISTORY_CONFIRMATION;
	}

	/**
	 * 【買い物かご確認】イベント。<br>
	 * メソッド仕様：買い物かご確認イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	public void checkShoppingCart() {

		// TODO 未実装（モーダル起動予定　課題No.12）
	}

	/**
	 * 画面DTO取得メソッド
	 *
	 * @return 画面DTO
	 */
	public Wns0002MenuScreenDto getWns0002MenuScreenDto() {
		return wns0002MenuScreenDto;
	}

	/**
	 * 画面DTO設定メソッド
	 *
	 * @param wns0002MenuScreenDto 画面DTO
	 */
	public void setWns0002MenuScreenDto(Wns0002MenuScreenDto wns0002MenuScreenDto) {
		this.wns0002MenuScreenDto = wns0002MenuScreenDto;
	}

}
