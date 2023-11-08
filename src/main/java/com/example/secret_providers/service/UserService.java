package com.example.secret_providers.service;

import com.example.secret_providers.model.User;

public interface UserService {

	User addUser(User user);

	String saveSecretData(String secretText);

	String getSecretData(String secretDataHash);

	void removeSecretData(String secretDataHash);

}