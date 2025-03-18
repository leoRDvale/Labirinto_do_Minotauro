# Labirinto do Minotauro

O Minotauro aprisionou Teseu em um labirinto infinito. O labirinto é representado por uma matriz bidimensional,
onde cada célula pode ser um caminho livre (`
.
`) ou uma parede (`#`). Teseu está na entrada do labirinto (célula
inicial) e precisa encontrar a saída (célula final).
Escreva um programa que utilize recursividade para encontrar um caminho válido do ponto de entrada ao ponto
de saída no labirinto.
Entrada
- Uma matriz bidimensional representando o labirinto, onde:
> `
.
`
representa um caminho livre.
> `#`
representa uma parede.
> `E`
representa a entrada do labirinto.
> `S`
representa a saída do labirinto.
Saída
- Uma matriz bidimensional representando o labirinto com o caminho percorrido por Teseu marcado com *
.
- Se não houver caminho válido, imprima a mensagem "Labirinto sem saída.
"
.
