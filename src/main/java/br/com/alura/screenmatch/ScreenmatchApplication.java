package br.com.alura.screenmatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screenmatch.client.Principal;
import br.com.alura.screenmatch.repository.SerieRepository;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

  @Autowired
  private SerieRepository serieRepository;

  public static void main(String[] args) {
    SpringApplication.run(ScreenmatchApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    Principal principal = new Principal(serieRepository);
    principal.exibeMenu();

  }

}
