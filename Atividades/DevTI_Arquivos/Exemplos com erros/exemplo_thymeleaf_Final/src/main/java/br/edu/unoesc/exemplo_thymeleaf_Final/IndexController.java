package br.edu.unoesc.exemplo_thymeleaf_Final;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoesc.exemplo_thymeleaf_Final2.Produto2;

@Controller
public class IndexController {
	
	@RequestMapping("/tl")
	String tl(Model model) {
		model.addAttribute("Mensagem", "Informação armazena no modelo");
		
		Produto2 p1 = new Produto2("um produto", 1, new BigDecimal("10"));
		Produto2 p2 = new Produto2("ssss", 3, new BigDecimal("333"));
		
		
		List<Produto2> produtos = new ArrayList<Produto2>();
		produtos.add(p1);
		produtos.add(p2);
		
		model.addAttribute("Produto", p1);
		model.addAttribute("Produtos", produtos);
		
		Instant agora = Instant.now();
		model.addAttribute("data", agora);
		
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("dd 'de' MMM 'de' yyyy");
		model.addAttribute("data_formatada", df.format(Date.from(agora)));
		
		model.addAttribute("valor", new BigDecimal("123.45"));
		
		System.out.println(produtos);
		
		return "index";
		
	}

}

