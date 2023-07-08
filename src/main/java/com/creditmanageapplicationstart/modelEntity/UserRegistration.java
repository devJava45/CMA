package com.creditmanageapplicationstart.modelEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistration {

	private String userName;
	private String emailId;
	private String mobileNo;

}
