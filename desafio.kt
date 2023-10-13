package com.example.oo_dio

class Desafio {

    enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

    enum class nivelUsuario { BASICO, INTERMEDIARIO, AVANCADO }

    data class Usuario(val nome: String, val nivelUsuario: nivelUsuario)

    class Curso(val nome: String, val duracao: Int = 60, val nivel: Nivel = Nivel.BASICO)

    class Formacao(val nome: String) {
        val inscritos = mutableListOf<Usuario>()
        val listaCursos = mutableListOf<Curso>()

        fun cursos(conteudos: Curso) {
            listaCursos.add(conteudos)
        }

        fun matricular(usuario: Usuario) {
            inscritos.add(usuario)
        }
    }

    fun main() {
        val formacao = Formacao("Formação DIO")

        val usuarioBruno = Usuario("Bruno", nivelUsuario.AVANCADO)
        val usuarioGiovanna = Usuario("Giovanna", nivelUsuario.AVANCADO)

        val cursoKotlin = Curso("Kotlin", 50, Nivel.INTERMEDIARIO)
        val cursoJava = Curso("Java", 40, Nivel.BASICO)

        formacao.matricular(usuarioBruno)
        formacao.matricular(usuarioGiovanna)

        formacao.cursos(cursoKotlin)
        formacao.cursos(cursoJava)

        // Adicione mais cursos, matricule mais usuários, etc.

        // Não é necessário retornar nada no método main.
    }
}
