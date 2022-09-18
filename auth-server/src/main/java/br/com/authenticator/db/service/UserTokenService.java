package br.com.authenticator.db.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.authenticator.db.entity.UserToken;
import br.com.authenticator.db.repository.UserTokenRepository;

@Service
public class UserTokenService {
    private final UserTokenRepository userTokenRepository;

    @Autowired
    public UserTokenService(final UserTokenRepository userTokenRepository) {
        this.userTokenRepository = userTokenRepository;
    }

    public void save(final UserToken userToken) {
        this.userTokenRepository.save(userToken);
    }

    public void delete(final UserToken userToken) {
        this.userTokenRepository.deleteById(userToken.getId());
    }

    public Optional<UserToken> getUserToken(final String token) {
        return this.userTokenRepository.findByToken(token);
    }
}