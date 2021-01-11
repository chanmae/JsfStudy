package fullstack.engineer.business.stub;

import java.util.HashMap;
import java.util.Map;

import fullstack.engineer.presentation.dto.UserInformation;

public class UserInformation_stub {

	/**
	 * 【スタブ】ユーザー情報取得。
	 * メソッド仕様：ユーザ情報の取得を行う。<br>
	 * 注意事項：なし。<br>
	 */
	public Map<String,UserInformation> getUserInformation(){

		// ユーザー情報マップ
		Map<String,UserInformation> userInformationMap=new HashMap<>();
		// ユーザー情報
		UserInformation userInformation=new UserInformation();
		userInformation.setLoginId("AB001");

		return null;

	}
}
