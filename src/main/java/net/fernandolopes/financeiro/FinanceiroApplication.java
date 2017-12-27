package net.fernandolopes.financeiro;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.fernandolopes.financeiro.domain.Cidade;
import net.fernandolopes.financeiro.domain.Endereco;
import net.fernandolopes.financeiro.domain.Estado;
import net.fernandolopes.financeiro.domain.Pessoa;
import net.fernandolopes.financeiro.domain.Usuario;
import net.fernandolopes.financeiro.domain.enums.PessoaTipo;
import net.fernandolopes.financeiro.repository.BancoRepository;
import net.fernandolopes.financeiro.repository.CidadeRepository;
import net.fernandolopes.financeiro.repository.ContaRepository;
import net.fernandolopes.financeiro.repository.EnderecoRepository;
import net.fernandolopes.financeiro.repository.EstadoRepository;
import net.fernandolopes.financeiro.repository.PessoaRepository;
import net.fernandolopes.financeiro.repository.UsuarioRepository;

@SpringBootApplication
public class FinanceiroApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private BancoRepository bancoRepository;
	@Autowired
	private ContaRepository contaRepository;

	
	

	public static void main(String[] args) {
		SpringApplication.run(FinanceiroApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		Usuario us1 = new Usuario(null, "usuario1", "senha");
		usuarioRepository.save(Arrays.asList(us1));
		
		Estado est1 = new Estado(null, "Parana");
		
		Cidade c1 = new Cidade(null, "Araruna", est1);
		
		Pessoa p1 = new Pessoa(null, "Fernando Lopes", "0672136144", "nandolopis@gmail.com", us1, PessoaTipo.PESSOAFISICA);
		
		p1.getTelefones().addAll(Arrays.asList("915456546", "93838313"));
		
		Endereco e1 = new Endereco(null, "Rua Gerbera", "391", "Casa D", "Jardim", "87260000", p1, c1);
		
		
		estadoRepository.save(Arrays.asList(est1));
		cidadeRepository.save(Arrays.asList(c1));
		pessoaRepository.save(Arrays.asList(p1));
		enderecoRepository.save(Arrays.asList(e1));
		
		
	
	}
	
	

}
