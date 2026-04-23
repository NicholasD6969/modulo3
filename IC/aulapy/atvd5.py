import os
os.system("cls | clear")

numeros = []

for n in range(8):
    numero = int(input("Digite um número: "))
    numeros.append(numero)

print("Números digitados: " + str(numeros))
print("Numeros positivos: " + str([num for num in numeros if num > 0]))
print("Numeros negativos: " + str([num for num in numeros if num < 0]))