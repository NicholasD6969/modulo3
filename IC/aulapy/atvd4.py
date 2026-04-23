import os
os.system("cls")

numeros = []

for i in range(7):
    n = int(input(f"Digite o {i+1}º número: "))
    numeros.append(n)
    
print(f"Números digitados: {numeros}")    