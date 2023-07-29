package com.Eventos.API;

import com.Eventos.API.Models.RolesModel;
import com.Eventos.API.Models.UsuariosModel;
import com.Eventos.API.Repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
/*
	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	UsuariosRepository usuariosRepository;

	@Bean
	CommandLineRunner init(){
		return args -> {
			RolesModel rol = new RolesModel();
			rol.setId(1L);

			UsuariosModel usuariosModel = UsuariosModel.builder()
					.nombre("Eduardo")
					.apellido("Aguilar")
					.estado(true)
					.username("edas12")
					.password(passwordEncoder.encode("1234"))
					.rolesModel(rol)
					.build();

			usuariosRepository.save(usuariosModel);

		};
	}*/
}
