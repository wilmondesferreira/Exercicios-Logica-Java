# 📘 Lista de Exercícios Básicos – Java

Este repositório contém uma lista de exercícios introdutórios para prática da linguagem **Java**. Os exercícios cobrem lógica básica, estruturas condicionais e de repetição, além de um desafio final mais complexo.

---

## 🎯 Objetivo

Praticar:
- Entrada e saída de dados
- Operações matemáticas
- Estruturas de decisão (`if`, `switch`)
- Laços de repetição (`for`, `while`)
- Lógica de programação

---

## 📝 Lista de Exercícios

### 🔥 Aquecimento

> Faça um algoritmo em Java que receba **três notas**, calcule e mostre a **média aritmética**.

---

### 1. Média Ponderada

Receba **três notas** e seus **respectivos pesos**, e calcule a **média ponderada**:

```
Mp = (x1.k1 + x2.k2 + x3.k3) / (k1 + k2 + k3)
```

**Exemplo**:  
Notas: 10, 8, 6  
Pesos: 4, 3, 2  
Resultado: `Mp = 8,44`

---

### 2. Salário com Gratificação e Imposto

Calcule o salário a receber com base no salário-base:  
- +5% de gratificação  
- -7% de imposto  

---

### 3. Conceito do Aluno

Com base na média final, exiba:

- `média < 7`: "Você precisa estudar mais"
- `média == 7`: "Você foi aprovado"
- `7.1 <= média < 8`: "Parabéns, notas acima da média"
- `8 <= média < 9`: "Média próxima da máxima"
- `média >= 9`: "Excelente aluno"

---

### 4. Número do Mês

Receba um número de **1 a 12** e retorne o **nome do mês correspondente**.

---

### 5. Calculadora Simples

Receba dois números e uma operação (soma, subtração, multiplicação ou divisão).

---

### 6. Números de 1 a 100

Imprima todos os números de **1 até 100**.

---

### 7. Números de 100 a 1

Imprima todos os números de **100 até 1**.

---

### 8. Ímpares entre 250 e 500

Imprima os números ímpares de **250 a 500** e a **soma total**.

---

### 9. Entrada de Números Positivos

Leia números enquanto forem positivos e exiba os que foram digitados.

---

### 10. Pares de 500 a 250

Imprima os números **pares** de **500 a 250** e a **soma total**.

---

### 🧠 Desafio Final

```java
/*
Leia um determinado número de pacientes e exiba:

i.   Quantidade total de pacientes
ii.  Quantidade com idade entre 18 e 25
iii. Média de idade dos homens
iv.  Quantidade de mulheres com altura entre 1,60 e 1,70 e peso > 70kg
v.   Nome do paciente homem mais velho
vi.  Nome da mulher mais baixa
*/
```

---

## 🗂️ Estrutura Sugerida do Projeto

```bash
java-exercicios/
├── README.md
└── src/
    ├── Exercicio02_MediaAritmetica.java
    ├── Exercicio02_MediaPonderada.java
    ├── Exercicio03_Salario.java
    ├── Exercicio04_ConceitoAluno.java
    ├── Exercicio05_MesDoAno.java
    ├── Exercicio06_Calculadora.java
    ├── Exercicio07_1a100.java
    ├── Exercicio08_100a1.java
    ├── Exercicio09_Impares250a500.java
    ├── Exercicio10_NumerosPositivos.java
    ├── Exercicio11_Pares500a250.java
    └── Desafio_Pacientes.java
```

---

## 🧪 Como Compilar e Executar

> É necessário ter o **Java JDK** instalado e configurado no PATH.

### Compilar

```bash
javac src/Exercicio02_MediaAritmetica.java
```

### Executar

```bash
java -cp src Exercicio01_MediaPonderada
```

---

## 📚 Licença

Este repositório é de uso **educacional** e está sob a licença MIT.
