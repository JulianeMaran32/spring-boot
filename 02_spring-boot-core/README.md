# Inversion of Control and Dependency Injection   

O Spring Boot é baseado em padrões de projeto Inversão de Controle (Inversion of Control - IoC) e Injeção de Dependência (Dependency Injection), promovendo um baixo acoplamento entre as classes de uma aplicação orientada a objetos.

- Inversion of Control (IoC) ou Inversão de Controle: cria e gerencia objetos.
- Dependency Injection ou Injeção de Dependência: injeta dependências de objeto.

Existem tipos de injeção de dependência, são eles: 
1. Constructor Injection (Injeção de Construtor): utilize quando tiver dependências necessárias; geralmente recomendado pela equipe de desenvolvimento spring.io como primeira escolha.
2. Setter Injection (Injeção Setter): é utilizado quando há dependências opcionais; caso a dependência não for fornecida, a aplicação pode fornecer uma lógica padrão razoável.
3. Field Injection (injeção de campo):os desenvolvedors do spring.io NÃO é recomenda o seu uso desse tipo de injeção de dependência, pois torna o código mais difícil de realizar testes unitários, no entanto, caiu em desuso; mas, ainda é possível ver aplicações legadas.

Exemplos:

```java
@RestController
public class DemoController {
	
	// Field Injection - NÃO recomendado
	@Autowired
	private Coach myCoach;
	
	// Constructor Injection - recomendado para dependências obrigatórias
	@Autowired
	public DemoController(Coach myCoach) {
		this.myCoach = myCoach;
	}

	// Setter Injection - recomendado para dependências opcionais
	@Autowired
	public void setCoach(Coach theCoach) {
		myCoach = theCoach;
	}

}
```

---

Para utilizar a injeção de dependência, fazemos o uso da Anotação `@Autowired`, desta forma o Spring irá procurar a classe correspondente por `class` ou `interface` e fará a injeção automaticamente, portanto, é auto conectado.

O uso da Anotação `@Autowired` será opcional quando tiver apenas um construtor, que irá informar ao Spring que deve fazer a injeção de dependência.
Porém, ao realizar a injeção de dependência, o Spring irá buscar anotações como `@Component` que possuem @Beans.

