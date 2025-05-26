# Sistema Acadêmico - FCTE

## Descrição do Projeto

Desenvolvimento de um sistema acadêmico para gerenciar alunos, disciplinas, professores, turmas, avaliações e frequência, utilizando os conceitos de orientação a objetos (herança, polimorfismo e encapsulamento) e persistência de dados em arquivos.

O enunciado do trabalho pode ser encontrado aqui:
- [Trabalho 1 - Sistema Acadêmico](https://github.com/lboaventura25/OO-T06_2025.1_UnB_FCTE/blob/main/trabalhos/ep1/README.md)

## Dados do Aluno

- **Nome completo:** Christian Silva Rolim
- **Matrícula:** 242004573
- **Curso:** Engenharias
- **Turma:** 06

---

## Instruções para Compilação e Execução

1. **Compilação:**  
javac -cp ../bin -d ../bin *.java
No diretório src

3. **Execução:**  
java -cp ../bin Main.java
No diretório src

5. **Estrutura de Pastas:**  
src: onde os arquivos .java ficam
bin: onde os binários ficarão
info: onde os arquivos com informações gerais ficam
assets: onde os assets usados no projeto ficam

3. **Versão do JAVA utilizada:**  
   java 21

---

## Vídeo de Demonstração

- [https://drive.google.com/file/d/1OpsfTetgFUKLw96t96PxMYVpVVQdPhFE/view?usp=drive_link]

---

## Prints da Execução

1. Menu Principal:  
   ![https://drive.google.com/file/d/1sTx5BT04satJ2x3H1zCGl1HMfGPV-gcy/view?usp=drive_link]

2. Cadastro de Aluno:  
   ![https://drive.google.com/file/d/1nFRh6RD9tHUhTypPpQFO5ntFaKtlCEkr/view?usp=drive_link]

3. Relatório de Frequência/Notas:  
   ![Inserir Print 3](caminho/do/print3.png)

---

## Principais Funcionalidades Implementadas

- [ ] Cadastro, listagem, matrícula e trancamento de alunos (Normais e Especiais)
- [ ] Cadastro de disciplinas e criação de turmas (presenciais e remotas)
- [X] Matrícula de alunos em turmas, respeitando vagas e pré-requisitos
- [ ] Lançamento de notas e controle de presença
- [ ] Cálculo de média final e verificação de aprovação/reprovação
- [ ] Relatórios de desempenho acadêmico por aluno, turma e disciplina
- [X] Persistência de dados em arquivos (.txt ou .csv)
- [X] Tratamento de duplicidade de matrículas
- [X] Uso de herança, polimorfismo e encapsulamento

---

## Observações (Extras ou Dificuldades)

- O projeto não foi finalizado. Muitas funções não foram implementadas, pois não tive um bom gerenciamento de tempo e foquei demais em problemas como file management. A interface gráfica foi iniciada. Tive dificuldades na organização do código, pois demorei demais para entender que métodos acessores de files deveriam ser generalizados e contidos em classes separadas, assim como configurações padrão para objetos na interface gráfica como JFrame deveriam ficar em classe separadas também. Algumas funções foram criadas e nunca utilizadas, como a função de listar alunos. No geral, o projeto poderia ter sido finalizado caso eu tivesse lidado melhor com o tempo.

---

## Contato

- christian.srolim@gmail.com
