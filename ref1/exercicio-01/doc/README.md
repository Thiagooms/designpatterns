# Exercício 01 — Sistema de Pagamentos

## Contexto

Você recebeu um sistema de processamento de pedidos de uma loja online.
O sistema já funciona, mas o time está com dificuldade para adicionar novos métodos de pagamento
sem quebrar o que já existe.

## Código entregue

| Arquivo | Responsabilidade |
|---|---|
| `Pedido.java` | Representa um pedido com produto, quantidade e preço |
| `ResultadoPagamento.java` | Representa o resultado de uma tentativa de pagamento |
| `ProcessadorPagamento.java` | Processa o pagamento de um pedido |
| `Main.java` | Demonstra o uso do sistema |

## Atividade

### Nível 1 — Identifique o problema

Leia o método `pagar()` em `ProcessadorPagamento.java` e responda:

1. O que acontece se você precisar adicionar o método de pagamento `cartao_debito`?
2. O que acontece se a lógica do PIX mudar (ex: passar a cobrar taxa de R$0,99)?
3. Quantas razões diferentes essa classe tem para mudar?

### Nível 2 — Nomeie o padrão

Com base no mapeamento de case1 smells:

- Qual é o nome do smell presente em `ProcessadorPagamento.java`?
- Qual design pattern resolve esse problema?
- Complete a frase: _"Quando vemos `______`, aplicamos `______` porque `______`"_

### Nível 3 — Refatore

Aplique o padrão identificado. Sua solução deve atender aos seguintes critérios:

- [ ] `ProcessadorPagamento` não deve mais conter `if/else` para decidir como pagar
- [ ] Adicionar um novo método de pagamento (ex: `cartao_debito`) não deve exigir alterar `ProcessadorPagamento`
- [ ] O resultado de `Main.java` deve ser idêntico ao original após a refatoração
- [ ] Cada forma de pagamento deve estar encapsulada em sua própria classe

## Dica

Pense em como `ProcessadorPagamento` poderia **delegar** o cálculo para outro objeto,
sem precisar saber qual método está sendo usado.
