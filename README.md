# **Sistema Acadêmico - FCTE**

## **Descrição do Projeto**  
Desenvolvimento de um sistema acadêmico para gerenciar alunos, disciplinas, professores, turmas, avaliações e frequência, utilizando os conceitos de orientação a objetos (herança, polimorfismo e encapsulamento) e persistência de dados em arquivos.


## **Trabalho 1 - Sistema Acadêmico**

### **Dados do Aluno** 
Nome completo: Evellyn de Sous Rocha
Matrícula: 202045400
Curso: Engenharia de software
Turma: T06

## **Instruções para Compilação e Execução**

### **Compilação:**
javac Main.java
Ou compile todos os arquivos com:
javac src/**/*.java

### **Execução:**
java Main


### **Estruturas de pastas:**
/src
  /model            -> Contém as classes de domínio (Aluno, Disciplina, Turma, etc.)
  /controller       -> Lógica de controle e regras de negócio
  /view             -> Interface com o usuário (menus, interação via terminal)
Main.java           -> Ponto de entrada da aplicação




### **Versão do java utilizada:**
Java 8 (versão 1.8.0_441)



### **Videos de demonstração:**
https://youtu.be/qEDKGcHhyu4


Prints da Execução

Menu Principal:
![Menu do sistema](img/menu.png)



Cadastro de Aluno:
![Tela de Cadastro](img/cadastro.png)

Relatório de Frequência/Notas:
Inserir Print 3

Principais Funcionalidades Implementadas
 Cadastro, listagem, matrícula e trancamento de alunos (Normais e Especiais)
 Cadastro de disciplinas e criação de turmas (presenciais e remotas)
 Matrícula de alunos em turmas, respeitando vagas e pré-requisitos
 Lançamento de notas e controle de presença
 Cálculo de média final e verificação de aprovação/reprovação
 Relatórios de desempenho acadêmico por aluno, turma e disciplina
 Persistência de dados em arquivos (.txt ou .csv)
 Tratamento de duplicidade de matrículas
 Uso de herança, polimorfismo e encapsulamento


Observações (Extras ou Dificuldades)

Tive dificuldades com versões diferentes do Java. O código foi compilado em uma versão superior (Java 11+), mas minha máquina estava com o Java 8, o que gerou erros como UnsupportedClassVersionError. A solução foi compilar com a versão correta compatível com a máquina.

rganização do projeto: Foi necessário organizar os arquivos seguindo uma estrutura de pastas (src/model, src/view, etc.), o que exigiu atenção aos pacotes e caminhos corretos para importar as classes.

Uso de Git e Submódulos: Utilizei submódulos do Git para conectar este repositório ao repositório principal do professor. Foi um processo novo que exigiu compreensão de como fazer fork, clone, adicionar submódulos e fazer os commits corretamente para garantir que o professor tenha acesso ao histórico.
Contato
evellynrocha.coz@gmail.com
