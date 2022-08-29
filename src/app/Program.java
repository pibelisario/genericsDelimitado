package app;

import entities.Produto;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Produto> list = new ArrayList<Produto>();

        String path = "D:\\Temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                String[] separado = line.split(",");
                list.add(new Produto(separado[0], Double.parseDouble(separado[1])));
                line = br.readLine();
            }
            Produto x = CalculationService.max(list);
            System.out.println("Most expensive: " +x);

        } catch (IOException e){
            System.out.println("Erro: " );
        }



    }
}
