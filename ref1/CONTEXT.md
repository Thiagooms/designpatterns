Estou em uma cadeira de MAP na faculdade, lá vejo muito exemplo de refatoração,
como design patters.

**Design patterns** que vemos:

**Criacionais:**
- Factory Method
- Singleton
**Estruturais:**
- Adapter
- Facade
**Comportamentais:**
- Strategy
- Iterator

Vamos praticar exemplo de refatorações aqui nesse projeto, eu quero que você crie exemplos
de questões para que a gente possa refatorar e falar sobre, quero que você me explique padrões
em questões de refatorações, por exemplo.

"Quando a gente vê X coisa, devemos fazer Y para resolver, isso é um padrão"

**Linguagem dos exercícios: Java**

---

## Metodologia de aprendizagem

### Template de exercício

Cada exercício de refatoração segue esta estrutura:

1. **Situação**: código com problema (antes)
2. **Code smell identificado**: nome do problema (ex: "God Class", "Switch Statement Smell")
3. **Padrão aplicável**: qual design pattern resolve
4. **Regra geral**: "Quando vemos X → aplicamos Y porque Z"
5. **Código refatorado**: depois

---

### Mapeamento Code Smell → Padrão

| Code Smell | Padrão |
|---|---|
| Criação de objetos espalhada/condicional | Factory Method |
| Instância global/duplicada | Singleton |
| Interfaces incompatíveis entre sistemas | Adapter |
| Subsistema complexo exposto diretamente | Facade |
| Condicionais grandes para variar comportamento | Strategy |
| Acesso interno a coleção exposto ao cliente | Iterator |

---

### Níveis de dificuldade

- **Nível 1**: identificar o smell no código
- **Nível 2**: nomear o padrão correto
- **Nível 3**: refatorar o código

---

### Critérios de refatoração bem-sucedida

- O comportamento externo não mudou
- O código ficou mais fácil de estender sem modificar (OCP)
- A responsabilidade está concentrada no lugar certo

---

### Estrutura dos exercícios

Cada exercício fica em sua própria pasta `exercicio-NN/` e contém:

- **2 a 3 classes `.java`** com implementação concreta (cálculos, validações, geração de dados — não apenas `System.out.println`)
- **`Maain.java`** demonstrando o uso do código problemático
- **`README.md`** descrevendo o contexto, as classes, e as perguntas dos 3 níveis

---

### Exercícios criados

| Exercício | Smell | Padrão | Status |
|---|---|---|---|
| `exercicio-01` | Switch Statement Smell | Strategy | em aberto |
