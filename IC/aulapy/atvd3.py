import os
os.system("cls")

nota = []

for i in range(5):
    nota_unidade = float(input("Digite a nota da unidade: "))
    nota.append(nota_unidade)
    
    if nota_unidade < 0 or nota_unidade > 10:
        print("Nota inválida. Digite uma nota entre 0 e 10.")
        nota.pop()  # Remove a nota inválida da lista

print(f"Notas digitadas: {nota}")
print(f"Média das notas: {sum(nota) / len(nota) if nota else 0:.2f}")