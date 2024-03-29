package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {
	private BonusService service;

	@BeforeEach
	public void inicializa() {
		this.service = new BonusService();
	}

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		try {
			service.calcularBonus(criarFuncionario(new BigDecimal("25000")));
			Assertions.fail("nao deu exception");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Funcionario com salario maior do que R$1000 nao pode receber bonus!", e.getMessage());
		}

	}

	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BigDecimal bonus = service.calcularBonus(criarFuncionario(new BigDecimal("2500")));

		Assertions.assertEquals(new BigDecimal("250.00"), bonus);
	}

	@Test
	void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() {
		BigDecimal bonus = service.calcularBonus(criarFuncionario(new BigDecimal("10000")));

		Assertions.assertEquals(new BigDecimal("1000.00"), bonus);
	}

	private Funcionario criarFuncionario(BigDecimal salario) {
		return new Funcionario("Rodrigo", LocalDate.now(), salario);
	}
}