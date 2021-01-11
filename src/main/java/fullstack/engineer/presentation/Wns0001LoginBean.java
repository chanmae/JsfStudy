package fullstack.engineer.presentation;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;

import fullstack.engineer.business.dto.Wns0001LoginEventInAppView;
import fullstack.engineer.business.dto.Wns0001LoginEventOutAppView;
import fullstack.engineer.business.facade.Wns0001LoginBusinessFacade;
import fullstack.engineer.presentation.common.constant.FormDataConst;
import fullstack.engineer.presentation.dto.UserInformation;
import fullstack.engineer.presentation.dto.Wns0001LoginScreenDto;

/**
 * WNS0001_ログイン画面のイベント処理を行う。<br>
 *
 * @author maeda
 */
@Named(value = "wns0001LoginBean")
@ViewScoped
public class Wns0001LoginBean implements Serializable {

	/** 画面DTO */
	private Wns0001LoginScreenDto wns0001LoginScreenDto;

	/** WNS0001ログイン画面イベントサービス */
	@Inject
	Wns0001LoginBusinessFacade wns0001LoginBusinessFacade;

	/** FacesContext */
	FacesContext facesContext;

	/** ユーザ情報 */
	UserInformation userInformation;

	/**
	 * コンストラクタ。<br>
	 */
	public Wns0001LoginBean() {
	}

	/**
	 * 【表示】イベント。<br>
	 * メソッド仕様：表示イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	@PostConstruct
	public void init() {

		// JSFアプリケーションの現在の状態を保持しているオブジェクト
		facesContext  = FacesContext.getCurrentInstance();

		// 画面DTOがnullの場合、インスタンスを生成する
		if (Objects.isNull(wns0001LoginScreenDto)) {
			wns0001LoginScreenDto = new Wns0001LoginScreenDto();
		}

		//Inアプリビュー
		Wns0001LoginEventInAppView wns0001LoginEventInAppView = new Wns0001LoginEventInAppView();
		//Outアプリビュー
		Wns0001LoginEventOutAppView wns0001LoginEventOutAppView = new Wns0001LoginEventOutAppView();

		// 表示イベントサービス呼び出し
		wns0001LoginEventOutAppView = wns0001LoginBusinessFacade.initEventSevrice(wns0001LoginEventInAppView);

		//ユーザー情報を設定
		//		userInformation.setUserInformationMap(wns0001LoginEventOutAppView.getUserInformation().getUserInformationMap());

	}

	/**
	 * 【ログイン】イベント。<br>
	 * メソッド仕様：ログインボタンクリックイベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	public String loginButtonClick() {
		// アプリビューIn
		Wns0001LoginEventInAppView wns0001LoginEventInAppView = new Wns0001LoginEventInAppView();

		// リクエスト情報マップ
		Map<String, String> params = new HashMap<>();
		// リクエストスコープで管理されている情報をMapで取得
		params = facesContext.getExternalContext().getRequestParameterMap();

		// ログインID取得
		String loginId = params.get(FormDataConst.LOGIN_FORM + FormDataConst.LOGIN_ID);
		// パスワード取得
		String passWord = params.get(FormDataConst.LOGIN_FORM + FormDataConst.PASSWORD);

		// ログイン認証を行う。
		boolean loginOk = loginAuthenticate(loginId, passWord);

		//ログイン認証がOKの場合
		if (loginOk) {
			// メニュー画面に遷移する
			// TODO 固定値をリターンしておく。実際は「faces-config.xml」でコントロール。（課題No.10）
			return FormDataConst.SCREEN_URL_WNS0002_MENU;
			//			return "loginOk";
		} else {
			//ログイン認証がNGの場合
			//画面遷移しない。
			//			return "loginNg";
			// TODO 固定値をリターンしておく。実際は「faces-config.xml」でコントロール。（課題No.10）
			return FormDataConst.SCREEN_URL_WNS0001_LOGIN;
		}
	}

	/**
	 * ログイン認証処理<br>
	 * メソッド仕様：ログイン認証を行う。<br>
	 * 注意事項：なし<br>
	 */
	private boolean loginAuthenticate(String loginId, String passWord) {

		// ログインIDがユーザー情報に存在するか確認
		// TODO ログインIDとパスワードが一致していれば、認証OKとしておく。
		if (!StringUtils.isEmpty(loginId)
				&& !StringUtils.isEmpty(passWord) && loginId.equals(passWord)) {
			return true;
		}
		return false;
	}

	/**
	 * 画面DTO取得メソッド
	 *
	 * @return 画面DTO
	 */
	public Wns0001LoginScreenDto getWns0001LoginScreenDto() {
		return wns0001LoginScreenDto;
	}

	/**
	 * 画面DTO設定メソッド
	 *
	 * @param Wns0001LoginScreenDto 画面DTO
	 */
	public void setWns0001LoginScreenDto(Wns0001LoginScreenDto wns0001LoginScreenDto) {
		this.wns0001LoginScreenDto = wns0001LoginScreenDto;
	}

}
