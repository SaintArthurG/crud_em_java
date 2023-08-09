package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DespesaDAO dao = new DespesaDAO();
        Despesa despesa = new Despesa();
       despesa.setDescricao("Hortifruti");
        despesa.setCategoria(Categoria.ALIMENTACAO);
        despesa.setValor(20);
        despesa.setDate(LocalDate.of(2023, 8, 10));

        Despesa despesaInserida = dao.save(despesa);
        System.out.println("foi inserida na ID: " + despesaInserida.getId());

    }
}
