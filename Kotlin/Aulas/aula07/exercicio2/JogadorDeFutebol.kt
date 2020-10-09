package Aulas.aula07.exercicio2

class JogadorDeFutebol(val nome: String){
    var energia: Int = 100
    var alegria: Int = 0
    var gols: Int = 0
    var experiencia: Int = 0

    fun fazerGol(){
        energia -= 5
        alegria += 10
        gols++
        println("GOOOOOOLLLLL!!!")
    }

    fun correr(){
        energia -= 10
        println("Cansei. Energia atual: $energia.")
    }
}