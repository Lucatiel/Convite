package com.example.ifpb.recuperacaorhavy4.util;


import com.example.ifpb.recuperacaorhavy4.entidade.Pessoa;

import java.util.List;



public interface BuscarPessoaCallBack {

    void backBuscarNome(List<Pessoa> names);

    void errorBuscarNome(String error);
}
