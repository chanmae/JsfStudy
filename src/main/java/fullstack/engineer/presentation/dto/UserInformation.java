package fullstack.engineer.presentation.dto;

import java.util.HashMap;
import java.util.Map;

public class UserInformation {

	/** ログインID*/
	String loginId;

	/** パスワード*/
	String passWord;

	/** ユーザ名*/
	String userName;

	/** ユーザ情報マップ*/
	Map<String, Map<String, String>> userInformationMap = new HashMap<>();

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

	/**
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName セットする userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return userInformationMap
	 */
	public Map<String, Map<String, String>> getUserInformationMap() {
		return userInformationMap;
	}

	/**
	 * @param userInformationMap セットする userInformationMap
	 */
	public void setUserInformationMap(Map<String, Map<String, String>> userInformationMap) {
		this.userInformationMap = userInformationMap;
	}

}
