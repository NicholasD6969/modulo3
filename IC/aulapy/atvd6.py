import os
os.system("cls | clear")

numeros = []
for x in range(5):
    numero = int(input("Digite um número: "))
    numeros.append(numero)

print("Números digitados: " + str(numeros))
print("Maior número: " + str(max(numeros))) 
print("Menor número: " + str(min(numeros)))