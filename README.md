# poo-27-10
atvidade 27/10
# Projeto CRUD em Java com ORMLite e SQLite (BlueJ)

Repositório da atividade prática de implementação de um CRUD completo utilizando a linguagem Java, a biblioteca ORMLite para mapeamento objeto-relacional e o banco de dados SQLite.

---

## 1. Descrição da Classe Escolhida e da Implementação

O sistema é composto por três classes principais dentro do ambiente BlueJ:

* **`Produto` (Entidade / Model):** Representa a tabela `produtos` no banco de dados[cite: 2]. Utiliza as anotações do ORMLite (`@DatabaseTable` e `@DatabaseField`) para mapear os atributos (ID gerado automaticamente, nome e preço) para as colunas correspondentes[cite: 2]. Conta também com construtores, métodos de acesso (*Getters* e *Setters*) e o método `toString()`[cite: 2, 3].
* **`ProdutoRepository` (Repositório / DAO):** Classe responsável por gerenciar a conexão com o banco de dados SQLite (`produtos.db`) e encapsular as operações de persistência utilizando o DAO (*Data Access Object*) do ORMLite[cite: 4, 5]. Ela implementa os métodos de criação, busca, atualização e exclusão[cite: 5].
* **`Main` (Classe Principal):** Executa o fluxo de testes automatizados do CRUD, instanciando o repositório, realizando operações e imprimindo os resultados no terminal do BlueJ[cite: 6, 7, 8].

---

## 2. Funcionamento das Operações CRUD (Comprovação por Capturas de Tela)

Abaixo estão as evidências do funcionamento de cada etapa do CRUD executadas através da classe `Main` e exibidas no terminal do BlueJ:

### Visão Geral do Projeto no BlueJ
A estrutura do projeto demonstra o relacionamento entre as classes `Main`, `Produto` e `ProdutoRepository`.
![Estrutura no BlueJ](Captura%20de%20tela%202026-10-27%20173730.png)

---

### Implementação das Classes

* **Entidade Produto:** Mapeamento dos campos e anotações ORMLite.
  *(Ver código nas imagens `Captura de tela 2026-10-27 173802.png` e `173813.png`)*
  
* **Repositório (DAO e Conexão SQLite):** Configuração da URL do banco de dados e métodos de persistência.
  *(Ver código nas imagens `Captura de tela 2026-10-27 174017.png` e `174039.png`)*

---

### Execução e Evidências no Terminal

A imagem a seguir comprova a execução bem-sucedida de todas as operações no banco de dados:

![Terminal do BlueJ - Execução do CRUD](Captura%20de%20tela%202026-10-27%20174318.png)

1. **CREATE (Armazenamento):** O objeto `Produto` (Teclado, R$ 120,00) é persistido com sucesso, gerando o ID correspondente no banco (`id=1` e `id=2`)[cite: 8].
2. **READ (Consulta):** Os dados são consultados com sucesso tanto por ID (`READ por ID`) quanto listados em conjunto (`LISTAGEM`)[cite: 6, 7, 8].
3. **UPDATE (Atualização):** O preço do produto é alterado de `120.0` para `99.9` e atualizado corretamente na base de dados[cite: 6, 8].
4. **DELETE (Exclusão):** O registro é removido com base no seu ID. A tentativa de busca posterior retorna `null`, comprovando a exclusão efetiva do banco de dados[cite: 7, 8].
