# 👥 Nossa Equipe

**Sistema de Gerenciamento de Funcionários (CRUD) em Java com persistência serializada**

[![Java](https://img.shields.io/badge/Java-21-orange)]()
[![Maven](https://img.shields.io/badge/Maven-Build-blue)]()
[![License](https://img.shields.io/badge/License-MIT-green)]()

O **Nossa Equipe** é um sistema de gerenciamento corporativo de funcionários desenvolvido em Java, focado em operações CRUD (Create, Read, Update, Delete). Projetado com fins de estudo e consolidação de conceitos de Engenharia de Software, o projeto aplica padrões de projeto clássicos, Programação Orientada a Objetos (POO) e manipulação avançada de I/O, garantindo uma aplicação de console robusta, tipada e com persistência de dados entre sessões.

### 🔗 Links
- **💻 Repositório:** [GitHub - Nossa Equipe](https://github.com/opablosantanaa/NossaEquipe)

---

## 📦 Módulos e Funcionalidades Detalhadas

O sistema opera inteiramente via interface de linha de comando (CLI), oferecendo uma experiência interativa e estruturada para o administrador da equipe:

### 👥 Entidades e Relacionamentos
- **Funcionário:** Entidade principal do sistema. Armazena dados corporativos como salário, categoria de atuação e data de nascimento. O sistema realiza o cálculo automático da idade com base na data atual utilizando a API nativa `java.time`.
- **Categoria:** Entidade de apoio que classifica os funcionários por setores ou níveis hierárquicos. Funciona como uma chave estrangeira lógica, permitindo filtros e segmentação de relatórios.
- **Universal:** Classe base (superclasse) que provê atributos e comportamentos comuns a todas as entidades do domínio, garantindo coesão e reutilização de código.

### ⚙️ Funcionalidades da Aplicação
- **CRUD Completo:** Operações de Criação, Leitura, Atualização e Remoção tanto para `Funcionários` quanto para `Categorias`.
- **Menu Interativo:** Interface de console (`MenuConsole`) intuitiva baseada em laços de repetição e na classe `Scanner`, que guia o usuário pelas operações disponíveis com validação de entradas.
- **Persistência Serializada (StorageFile):** Diferente de aplicações que dependem de SGBDs, o Nossa Equipe salva o estado da aplicação (`AppData`) em disco rígido. Ao encerrar o sistema, todos os objetos são serializados em um arquivo binário (`dados.app`), e carregados automaticamente na próxima execução através de `ObjectOutputStream` e `ObjectInputStream`.
- **Cálculos Temporais:** Uso de `LocalDate` e `Period` para cálculos precisos de idade e validação de datas.

---

## 🛠️ Tecnologias e Padrões Utilizados

### Stack Principal
- **Java 21:** Última versão LTS do Java, aproveitando recursos modernos da linguagem.
- **Maven:** Gerenciador de dependências e ciclo de vida do build.
- **Java I/O (NIO e IO):** `Files`, `Paths`, `ObjectInputStream` e `ObjectOutputStream` para leitura e escrita de arquivos serializados.

### Padrões de Projeto e Arquitetura
- **Repository Pattern:** Implementação de interfaces (`InterfaceRepositoryFuncionario`, `InterfaceRepositoryCategoria`) para isolar a lógica de negócios da camada de acesso a dados em memória, reduzindo o acoplamento.
- **Separação de Camadas (MVC Adaptado):** Divisão clara entre as Entidades (Model), os Repositórios/Storage (Persistência) e o MenuConsole (View/Controller de console).
- **Injeção de Dependência Manual:** Gerenciamento do ciclo de vida dos repositórios e da camada de storage instanciados e passados via construtor na classe principal `App`.

---

## ⚙️ Configuração e Execução Local

### 1. Pré-requisitos
- **JDK 21** ou superior instalado na máquina.
- **Apache Maven** configurado nas variáveis de ambiente.
- **Git** para clonar o repositório.

### 2. Clonar o Repositório

```bash
git clone https://github.com/opablosantanaa/NossaEquipe.git
cd NossaEquipe
```

### 3. Compilar o Projeto com Maven

```bash
mvn clean package
```
*Nota: Isso irá gerar o arquivo `.jar` na pasta `target/` e baixar as dependências do projeto.*

### 4. Executar a Aplicação

Você pode executar o sistema de duas formas:

**Via Linha de Comando (CLI):**
```bash
java -cp target/NossaEquipe-1.0-SNAPSHOT.jar App
```

**Via IDE (IntelliJ IDEA, Eclipse, VS Code):**
1. Importe o projeto como um *Maven Project*.
2. Navegue até `src/main/java/App.java`.
3. Clique com o botão direito e selecione **Run 'App.main()'**.

---

## 🗂️ Estrutura de Diretórios

O projeto segue uma arquitetura modular e bem definida:

```text
├── src/main/java/
│   ├── App.java                      # Ponto de entrada da aplicação (Bootstrap)
│   └── com/nossaequipe/
│       ├── entity/                   # Entidades do domínio (Modelos)
│       │   ├── Universal.java        # Superclasse base
│       │   ├── Funcionario.java      # Entidade Funcionário
│       │   └── Categoria.java        # Entidade Categoria
│       ├── menu/                     # Interface de Usuário
│       │   └── MenuConsole.java      # Lógica de exibição e captura de inputs
│       ├── repository/               # Camada de acesso a dados (Em memória)
│       │   ├── InterfaceRepository...# Contratos (Interfaces)
│       │   └── Repository...         # Implementações das coleções
│       └── storage/                  # Camada de persistência em disco
│           ├── AppData.java          # Wrapper dos dados a serem salvos
│           └── StorageFile.java      # Leitura/Escrita serializada (.app)
└── pom.xml                           # Configuração do Maven
```

---

## 💡 Conceitos Acadêmicos e Técnicos Aplicados

Este repositório serve como uma excelente base de estudos e portfólio para os seguintes tópicos em Ciência da Computação:
- **Programação Orientada a Objetos (POO):** Herança, Polimorfismo, Encapsulamento e Abstração.
- **Coleções em Java:** Uso intensivo de `List`, `ArrayList` e manipulação de elementos.
- **Serialização de Objetos:** Implementação da interface `Serializable` e uso do `serialVersionUID`.
- **Tratamento de Exceções:** Blocos `try-catch-resources` para garantir o fechamento correto de fluxos de I/O (Streams) e evitar vazamento de memória.
- **Design Patterns:** Uso prático do padrão *Repository* para abstrair a fonte de dados.

---

## 🔒 Observações de Segurança e Boas Práticas

- **Persistência Local:** Os dados da aplicação são salvos em um arquivo binário (`dados.app`) no diretório raiz de execução. Certifique-se de ter permissões de leitura e escrita na pasta onde o `.jar` for executado.
- **Controle de Versão:** O diretório `.idea/` (configurações do IntelliJ) está presente no repositório. Em ambientes de produção ou open-source maduros, recomenda-se fortemente adicionar `.idea/` e `target/` ao arquivo `.gitignore`.
- **Gerenciamento de Memória:** A aplicação carrega todos os dados para a memória RAM durante a execução. É ideal para volumes pequenos/médios de dados corporativos de estudo.

---
Desenvolvido por **@opablosantanaa**.