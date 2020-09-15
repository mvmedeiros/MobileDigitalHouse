/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Repetição

    Nível 1 - Exercício 4: Faça um programa que leia e valide as seguintes informações:
                           Nome: maior que 3 caracteres;
                           Idade: entre 0 e 150;
                           Salário: maior que zero;
                           Sexo: 'f' ou 'm';
                           Estado Civil: 's', 'c', 'v', 'd';
*/

package Aulas.aula05.Repetição

fun main(){
    println("INICIANDO VALIDAÇÃO DE DADOS")
    println("Informe o nome: ")
    var nome: String = readLine()!!

    println("Informe a idade: ")
    var idade = readLine()!!.toInt()

    println("Informe o salário: ")
    var salario = readLine()!!.toDouble()

    println("Informe o sexo: ")
    var sexo: String = readLine()!!.toLowerCase()

    println("Informe o estado civil: ")
    var estadoCivil: String = readLine()!!.toLowerCase()

    //Validação do nome
    if(nome.length > 3 ){
        println("O nome informado é válido: ${nome.length} caracteres.")
    }else{
        println("O nome só é válido com mais de 3 caracteres.")
    }

    //Validação da idade
    if(idade > 0 && idade < 150){
        println("A idade informado é válida.")
    }else{
        println("A idade só é válida entre 0 e 150 anos.")
    }

    //Validação do salário
    if(salario > 0 ){
        println("O salário informado é válido.")
    }else{
        println("O salário só é válido acima de zero.")
    }

    //Validação do sexo
    if(sexo == "m" || sexo == "f"){
        println("O sexo informado é válido.")
    }else{
        println("O sexo só é válido para M (masculino) e F (feminino) (embora isso não seja verdade).")
    }

    //Validação do estado civil
    when(estadoCivil) {
        "s" -> estadoCivil = "Solteiro(a)"
        "c" -> estadoCivil = "Casado(a)"
        "v" -> estadoCivil = "Viúvo(a)"
        "d" -> estadoCivil = "Divorciado(a)"
        else -> estadoCivil = "NA"
    }

    if(estadoCivil == "NA"){
        println("Informe um dos estados civis válidos: S (solteiro(a)), C (casado(a)), V (viúvo(a)) ou D (divorciado(a).")
    }else{
        println("O estado civil é ${estadoCivil}.")
    }
}