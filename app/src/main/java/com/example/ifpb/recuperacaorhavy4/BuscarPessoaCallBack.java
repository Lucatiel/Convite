package com.example.ifpb.recuperacaorhavy4;


import java.util.List;



public interface BuscarPessoaCallBack {

    void backBuscarNome(List<Pessoa> names);

    void errorBuscarNome(String error);
}
