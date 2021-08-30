package br.com.alura.list

fun listaDeLivrosComNulos() {
    listaDeLivros2
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}