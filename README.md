# Sistema de Verificação de Voto em Java

Um sistema simples desenvolvido em Java para verificar o status de votação de um eleitor com base em sua idade e sexo, seguindo as regras eleitorais brasileiras. Este projeto foi criado com foco em boas práticas de Programação Orientada a Objetos (POO), utilizando modularidade através de pacotes e classes com responsabilidades bem definidas.

---

🚀 Funcionalidades
Coleta de Dados do Eleitor: Solicita o nome, idade e sexo do usuário através do console.

Aplicação de Regras de Votação:

Voto Opcional para idades entre 16 e 17 anos.

Voto Obrigatório para maiores de 18 anos.

Voto Opcional para homens com 62 anos.

Voto Opcional para mulheres com mais de 65 anos.

Feedback ao Usuário: Informa o status de votação e, em casos opcionais, pergunta se o eleitor deseja votar.

---

🛠️ Tecnologias Utilizadas
Java: Linguagem de programação principal.

Conceitos de POO: Encapsulamento, Composição, Separação de Responsabilidades.

Estrutura de Pacotes: Organização do código para modularidade.

Enum: Utilizado para definir os status de votação de forma clara e segura.

---

📂 Estrutura do Projeto
O projeto está organizado nos seguintes pacotes para garantir uma boa separação de responsabilidades:

src/<br>
└── main/<br>
    └── java/<br>
        └── com/<br>
            └── votacao/<br>
                ├── main/<br>
                │   └── AplicacaoVotacao.java (Ponto de entrada do programa - método main)<br>
                ├── model/<br>
                │   ├── Eleitor.java (Classe que representa a entidade Eleitor)<br>
                │   └── StatusVotacao.java (Enum para os status de voto)<br>
                ├── service/<br>
                │   ├── InteracaoUsuario.java (Lida com a entrada/saída de dados do console)<br>
                │   └── RegrasVotacao.java (Contém a lógica das regras de negócio de votação)<br>
                └── util/<br>
                    └── ConsoleHelper.java (Classe utilitária para operações de console)<br>

▶️ Como Executar
Para rodar este projeto em sua máquina, siga os passos abaixo:

Clone o Repositório:

git clone <URL_DO_SEU_REPOSITORIO>
cd sistema-verificacao-voto # Ou o nome do seu projeto

Compile o Código:
Navegue até a pasta src/main/java no seu terminal e compile os arquivos Java:

javac com/votacao/main/AplicacaoVotacao.java \
      com/votacao/model/Eleitor.java \
      com/votacao/model/StatusVotacao.java \
      com/votacao/service/InteracaoUsuario.java \
      com/votacao/service/RegrasVotacao.java \
      com/votacao/util/ConsoleHelper.java

(Se você estiver usando uma IDE como IntelliJ IDEA ou Eclipse, a compilação é geralmente automática.)

Execute o Programa:
Ainda na pasta src/main/java, execute a classe principal:

java com.votacao.main.AplicacaoVotacao

O programa iniciará no console, solicitando as informações do eleitor.
