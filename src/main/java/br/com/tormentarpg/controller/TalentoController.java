package br.com.tormentarpg.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.opencsv.CSVReader;

import br.com.tormentarpg.model.Talento;
/*import br.com.tormentarpg.service.TalentoService;*/

@Controller
@RequestMapping("/talentos")
public class TalentoController {

	/*@Autowired
	private TalentoService talentoService;*/
	
	@GetMapping
	public ModelAndView listar() throws IOException {
		ModelAndView modelAndView = new ModelAndView("ListaTalentos");
		
		String caminho = "C:\\Users\\emanuel.tavares\\Downloads\\t\\TALENTOS.csv";

		CSVReader reader = null;
		FileReader r = null;

		try {
			r = new FileReader(caminho);
			reader = new CSVReader(r, ';');

			List<Talento> talentos = new ArrayList<>();

			// read line by line
			String[] record = null;

			while ((record = reader.readNext()) != null) {
				Talento t = new Talento();

				t.setNome(record[0]);
				t.setDescricao(record[1]);
				t.setPreRequisito(record[2]);
				t.setBeneficio(record[3]);
				t.setObservacao(record[4]);
				t.setTipoMagia(record[5]);
				t.setCusto(record[6]);
				t.setTipoTalento(record[7]);
				t.setManual(record[8]);

				talentos.add(t);
			}
			
			/*modelAndView.addObject("talentos", talentoService.findAll());*/
			modelAndView.addObject("talentos", talentos);
			modelAndView.addObject(new Talento());

		} finally {
			if(r != null )
				r.close();
			if(reader != null)
				reader.close();
		}

		return modelAndView;
	}

	
}
