import os
idades = []

while True:
    idade = int(input("Digite a idade (ou -1 para encerrar): "))
    idades.append(idade)
    if idade == -1:
        break
    else:
        idades.append(idade)
contagem = 0

for x in idades:
    if x >= 18:
        print(x, end="|")
        if x >= 18:
            contagem = contagem + 1
        
   

print(f"Idades Digitadas: {idades}")
print(f"Quantidade de idades digitadas: {len(idades)}") 
print(f"Média das idades: {sum(idades) / len(idades) if idades else 0:.2f}")
print(f"Quantidade de pessoas maiores de idade: {contagem}")