import os
os.system("cls")

idades = []

while True:
    idade = int(input("Digite a idade: "))
    idades.append(idade)

    if idade == -1:
        print(f"não armazena esse valor.")
        break
soma = sum(idade) 
print(f"Idades: {idades}")
print(f"Quantidades de idades: {len(idades) -1}")
print(f"Media das idades: {soma}(len)")    