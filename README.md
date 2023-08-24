# BDD-Cucumber
Cucumber é uma ferramenta que visa deixar mais humando e eficiente o contato e planejamento analistaXdesenvolvedor, criando testes que indicam de forma mais humano se o que se deseja foi ou não alcançado


Integrar JUnit com Cucumber:
@RunWith(Cucumber.class) - > Anotação que indica ao JUnit que o teste irá rodar junto ao Cucumber
@CucumberOptions(features = "classpath:features") -> Indica ao Cucumber onde estão as features a serem consideradas