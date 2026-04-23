import os
os.system("cls")

numero = []

for i in range(6):
    n = int(input("Digite um número: ")) 
    numero.append(n)
    
print(f"Números digitados: {numero}")
print(f"Números pares:" + str([x for x in numero if x % 2 == 0])) 
print(f"Números ímpares:" + str([x for x in numero if x % 2 != 0]))   
    