package com.Eventos.API.Services;



import com.Eventos.API.Models.UsuariosModel;
import com.Eventos.API.Repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuariosModel trabajadoresModel = usuariosRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario " + username + " no existe"));

        Collection<? extends GrantedAuthority> authorities = trabajadoresModel.getRolesModel() != null ?
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + trabajadoresModel.getRolesModel().getNombre())) :
                null;


        return new User(
                trabajadoresModel.getUsername(),
                trabajadoresModel.getPassword(),
                true,
                true,
                true,
                true,
                authorities
        );
    }
}
