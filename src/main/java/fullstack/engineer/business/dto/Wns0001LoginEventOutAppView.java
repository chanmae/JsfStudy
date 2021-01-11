/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullstack.engineer.business.dto;

import fullstack.engineer.presentation.dto.UserInformation;

/**
 *
 * @author maeda
 */
public class Wns0001LoginEventOutAppView {

	// ユーザ情報
	UserInformation userInformation;

	/**
	 * @return userInformationMap
	 */
	public UserInformation getUserInformation() {
		return userInformation;
	}

	/**
	 * @param userInformationMap セットする userInformationMap
	 */
	public void setUserInformation(UserInformation userInformationMap) {
		this.userInformation = userInformationMap;
	}



}
