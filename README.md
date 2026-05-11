# Desafio Técnico - Estágio Desenvolvedor Cloud

Implementações em **Java 25** dos algoritmos solicitados.
 
---

## 1. Fibonacci

A função recebe um número `N >= 0`, valida o input e retorna o valor correspondente na sequência de Fibonacci.

### Recursiva
Resolve chamando a própria função para `(n-1)` e `(n-2)` até atingir os casos base.
Complexidade de tempo: **O(2ⁿ)**.

### Linear
Resolve iterativamente, mantendo apenas os dois valores anteriores em memória.
Complexidade de tempo: **O(n)**.


## 2. Números Primos

A função recebe um número N > 1, valida o input e retorna todos os números primos até N.

### Recursiva
Resolve chamando a própria função para `(n-1)` e verificando se N é primo.
Complexidade de tempo: **O(n √n)**.

### Linear
Resolve iterativamente verificando cada número de 2 até N.
Complexidade de tempo: **O(n √n)**.


## Tecnologias

- Java 25
- Zero dependências externas
