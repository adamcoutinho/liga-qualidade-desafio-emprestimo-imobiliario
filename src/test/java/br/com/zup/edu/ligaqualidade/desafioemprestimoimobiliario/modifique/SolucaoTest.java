package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SolucaoTest {
	
  @ParameterizedTest
  @CsvSource({
	  "test/input/input000.txt,test/output/output000.txt",
	  "test/input/input001.txt,test/output/output001.txt",
	  "test/input/input002.txt,test/output/output002.txt",
	  "test/input/input003.txt,test/output/output003.txt",
	  "test/input/input004.txt,test/output/output004.txt",
	  "test/input/input005.txt,test/output/output005.txt",
	  "test/input/input006.txt,test/output/output006.txt",
	  "test/input/input007.txt,test/output/output007.txt",
	  "test/input/input008.txt,test/output/output008.txt",
	  "test/input/input009.txt,test/output/output009.txt",
	  "test/input/input010.txt,test/output/output010.txt",

  })
  
  public void teste(String entrada,String saidaEsperada) throws IOException  {

      Path inputPath = Paths.get(entrada);

      Path outputPath = Paths.get(saidaEsperada);

      List<String> inputLines = Files.readAllLines(inputPath);

      List<String> outputLines = Files.readAllLines(outputPath);
      
      String idsValidados = Solucao.processMessages(inputLines);
      
      Assertions.assertEquals(outputLines.get(0),idsValidados);
  }
}