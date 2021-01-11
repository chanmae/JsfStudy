package fullstack.engineer.presentation.dto;

import java.io.Serializable;

/**
 * WNS0001ログイン画面の画面出力情報を保持する。<br>
 *
 * @author maeda
 */
public class Wns0001LoginScreenDto implements Serializable {

	/**ログインID*/
	private String loginId;

	/**パスワード*/
	private String passWord;

	/**
	 * コンストラクタ<br>
	 */
	public Wns0001LoginScreenDto() {
	}

	/**
	 * @return loginId
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * @param loginId セットする loginId
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * @return passWord
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * @param passWord セットする passWord
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


}
