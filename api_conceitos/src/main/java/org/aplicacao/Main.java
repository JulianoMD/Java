package org.aplicacao;

import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.servico.ApiServico;

import java.io.IOException;

public class Main {
    static void main (String[] args) {

        ApiServico apiServico = new ApiServico();

        try {
            EnderecoDto enderecoDto = apiServico.getEndereco("04689160");
            System.out.println(enderecoDto.getLogradouro());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
