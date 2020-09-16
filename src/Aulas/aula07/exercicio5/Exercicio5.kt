package Aulas.aula07.exercicio5

fun main(){
    val cliente1 = Cliente("José", "Alberto", "(87)98563-7685")
    val cliente2 = Cliente("Carlos", "de Nóbrega", "(73)88520-4285")
    val cliente3 = Cliente("Maria", "Rita", "(25)90832-4598")

    val cybertruck = Veiculo("Tesla","Cybertruck",2020,"Cinza",0.0)
    val fusca = Veiculo("Volkswagen","Fusca",1938,"Preto",99999.99)
    val relampagoMarquinhos = Veiculo("Pixar","Relâmpago Marquinhos",2006,"Vermelho",57099.5)

    val concessionaria = Concessionaria()
    val venda1 = Venda(cliente1,cybertruck,170000.0)
    val venda2 = Venda(cliente2,fusca,12000.0)
    val venda3 = Venda(cliente3,relampagoMarquinhos,80500.0)
    concessionaria.registrarVenda(venda1)
    concessionaria.registrarVenda(venda2)
    concessionaria.registrarVenda(venda3)

    concessionaria.exibirRegistro()
}