package co.edu.uniempresarial.primerp;

import java.lang.ModuleLayer.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PrimerProyectoController {
	
	@GetMapping(value="control1",produces = MediaType.APPLICATION_JSON_VALUE)
	public String getMethodName(@RequestParam String param) {
		return new String();
	}
	
	public String primerControlador(){
		return "Controlador 1";
	}
	@GetMapping(value="addition/{num1}/{num2}",produces = MediaType.APPLICATION_JSON_VALUE)
	public double sumar( @PathVariable("num1")double numero1, @PathVariable("num2")double numero2)
	{
		
		return numero1 + numero2;
	}
	//Recibiendo valores con queryparam
	
	@RequestMapping (value="sustract",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public double restar(@RequestParam("num1")double numero1, @RequestParam("num2")double numero2) {
	  return numero1 - numero2;
     }
	
    @GetMapping(value="multiplication/{num1}/{num2}",produces = MediaType.APPLICATION_JSON_VALUE)
     public double multiplicar( @PathVariable("num1")double numero1, @PathVariable("num2")double numero2) {
     return numero1 * numero2;	
    }
    @GetMapping(value="division/{num1}/{num2}",produces = MediaType.APPLICATION_JSON_VALUE)
	public double dividir( @PathVariable("num1")double numero1, @PathVariable("num2")double numero2) {
	return numero1 / numero2;
	if num2 = "0"{
			System.out.println("error no puede ingresar 0");
    }
    }
}