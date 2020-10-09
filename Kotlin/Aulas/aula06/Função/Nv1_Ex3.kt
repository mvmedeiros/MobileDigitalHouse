/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 6: Exercícios Funções

    Nível 1 - Exercício 3: Faça um programa com uma função chamada somaImposto. A função possui
                           dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas
                           expressa em porcentagem e custo, que é o custo de um item antes do imposto. A
                           função “altera” o valor de custo para incluir o imposto sobre vendas.
*/

package Aulas.aula06.Função

fun main(){
    print(somaImposto(7.3,578.7))
}

fun somaImposto(taxaImposto:Double, custo:Double) = (1 + taxaImposto/100) * custo