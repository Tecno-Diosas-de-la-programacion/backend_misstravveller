package com.missTravveller.app.security;
//
////import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;


//
//
//@Configuration
//@EnableWebSecurity 
//public class WebSecurityConfig {
//
//	// STEP 1 Autenticación basada en usuarios en memoria
//		@Bean
//		UserDetailsService userDetailsService() {
//		
//		//Builder: Esto es un patron de diseño que nos evita poner get
//			UserDetails sergio = User.builder()
//								.username("sergio")
//								.password("{noop}costco")
//								.roles("CUSTOMER", "SAYAYIN") // "ROLE_CUSTOMER"
//								.build();
//			UserDetails duende = User.builder()
//					.username("duende")
//					.password("{noop}malito")
//					.roles("CUSTOMER", "ADMIN")
//					.build();
//			return new InMemoryUserDetailsManager( sergio, duende);
//		}	
//		
//		// STEP 1.1 Crear un bean de PassworsEncoder
//		/**
//		 *  Crear un bean de BCryptPasswordEncoder.
//		 *  BCrypPasswordEncoder es una implementación de PasswordEncoder proporcionada
//		 *  por Spring Security. Se utiliza para codificar y verificar contraseñas utilizando
//		 *  el algoritmo de hashing bcrypt.
//		 *  El algoritmo incorpora un sal aleatoria por cada contraseña, lo que agrega un capa
//		 *  adicional de seguridad.
//		 */	
//		
//		@Bean
//		PasswordEncoder passwordEncoder() {
//			return new BCryptPasswordEncoder();
//		}
//		
//		/**Ejecutar para tener una muestra de una contraseña encriptada */
//		
//	//encriptar la contraseña 
//	
//	public static void main(String[] args) {
//		System.out.println(new BCryptPasswordEncoder().encode("123")); //aqui entre comillas va la contraseña que vamosa enciptar
//	}
//	
//
//	/** STEP 2 Realizar configuraciones personalizadas del filter chain **/
//	@Bean
//	SecurityFilterChain filterChain( 
//			HttpSecurity http,
//			AuthenticationManager authManager,
//			JWTAuthorizationFilter jwtAuthorizationFilter
//			) throws Exception {
//}
