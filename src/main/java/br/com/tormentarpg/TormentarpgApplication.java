package br.com.tormentarpg;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.opencsv.CSVReader;

import br.com.tormentarpg.model.Talento;

@SpringBootApplication
public class TormentarpgApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(TormentarpgApplication.class, args);
		
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

			System.out.println(talentos.size());
		} finally {
			if(r != null )
				r.close();
			if(reader != null)
				reader.close();
		}
	}
}
