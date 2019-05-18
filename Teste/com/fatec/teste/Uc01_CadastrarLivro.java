package com.fatec.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.fatec.model.Livro;

class Uc01_CadastrarLivro {

	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("1212112");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Roger Presman");
		} catch (RuntimeException e) {
			// verificacao
			fail("");
		}
	}

	@Test
	public void CT02CadastrarLivroComISBN_em_branco() {
		// cenario
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setIsbn("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN Inválido", e.getMessage());
		}
	}

	@Test
	public void CT03CadastrarLivroComTitulo_em_Branco() {

		Livro livro = new Livro();
		livro.setIsbn("1212112");
		livro.setAutor("Presman");

		try {
			livro.setTitulo("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Título Inválido", e.getMessage());
		}
	}

	@Test
	public void CT04CadastrarLivroComAutor_em_Branco() {
	
		 Livro livro = new Livro();
		 livro.setIsbn("1212112");
		 livro.setTitulo("Engenharia de Software");
		 try {
			 livro.setAutor("");
			 fail("deveria lançar uma excessão");
		 } catch (RuntimeException e){
			 assertEquals("Autor Inválido", e.getMessage());
		 }
	}
}
