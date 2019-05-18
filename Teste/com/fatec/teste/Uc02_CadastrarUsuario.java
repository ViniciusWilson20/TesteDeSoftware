package com.fatec.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.fatec.model.Usuario;

class Uc02_CadastrarUsuario {

	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {

		try {
			// cenario
			Usuario usuario = new Usuario();

			// acao
			usuario.setRa("0481722023");
			usuario.setNome("Vinicius Wilson");

		} catch (RuntimeException e) {
			// verificacao
			fail("Não deve falhar");
		}

	}

	@Test
	public void CT02CadadastrarUsuarioComRa_em_Branco() {

		Usuario usuario = new Usuario();
		usuario.setNome("Vinicius Wilson");

		try {

			usuario.setRa("");
			fail("Deveria Lançar uma Excessão");
		} catch (RuntimeException e) {
			assertEquals("Ra Inválido", e.getMessage());
		}

	}

	public void CT03CadastrarUsuarioComNome_em_Branco() {

		Usuario usuario = new Usuario();
		usuario.setRa("0481722023");
		try {

			usuario.setNome(null);
			fail("Deveria Lançar uma Excessão");

		} catch (RuntimeException e) {
			assertEquals("Nome Inválido", e.getMessage());
		}

	}

}
