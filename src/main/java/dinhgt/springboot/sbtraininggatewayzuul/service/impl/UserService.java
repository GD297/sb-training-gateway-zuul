package dinhgt.springboot.sbtraininggatewayzuul.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dinhgt.springboot.sbtraininggatewayzuul.model.Account;
import dinhgt.springboot.sbtraininggatewayzuul.model.UserDetailsImpl;
import dinhgt.springboot.sbtraininggatewayzuul.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository accountRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = accountRepository.findByEmailAndIsActived(username, true).get();
		System.err.println(account.getEmail());
		return UserDetailsImpl.build(account);
	}

}
