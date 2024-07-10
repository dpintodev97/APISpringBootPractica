package com.practicaAPI.APISpringBootPractica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
 * CLASE HelloController, EN CAPA CONTROLLER SIGUIENDO PATRÓN MVC; Capa Controladora DE LAS SOLICITUDES HTTP DE LA API
 * @RestController: para marcar una clase como un controlador RESTful. 
 * 	Esto significa que la clase contiene métodos que se pueden mapear a endpoints HTTP para manejar solicitudes y respuestas REST.

 */
@RestController
public class HelloController {
	
	/*
	 * 2 MÉTODOS (SALUDO Y DESPIDO) AGREGANDO PARAMETRO DE ENTRADA, VARIBLE nombre
	 */
	@GetMapping("hello/{nombre}")
	public String sayHello(@PathVariable String nombre) {
		return "Hola Mundo! " + nombre + ", esto es una prueba con API REST ;)";
	}
	@GetMapping("/bye")
	public String sayBye() {
		return "Goodbye Mundo!";
	}
	

}
