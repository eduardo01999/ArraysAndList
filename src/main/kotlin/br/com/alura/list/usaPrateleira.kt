package br.com.alura.list

fun usaPrateleira() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros2)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}