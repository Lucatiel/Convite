package com.example.ifpb.recuperacaorhavy4.entidade;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by IFPB on 13/04/2016.
 */

    import com.google.gson.annotations.SerializedName;

    import java.io.Serializable;

    public class Pessoa implements Serializable {


        public Pessoa(String nome, int id, int qrcode) {
            this.nome = nome;
            this.id = id;
            this.qrCode = qrcode;
        }

        public Pessoa() {
        }

        @SerializedName("id")
        private int id;

        @SerializedName("fullName")
        private String nome;

        @SerializedName("qrCode")
        private int qrCode;


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getQrCode() {
            return qrCode;
        }

        public void setQrCode(int qrCode) {
            this.qrCode = qrCode;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", qrCode=" + qrCode +
                    '}';
        }
    }


