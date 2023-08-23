package br.com.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CaminhoArquivo {


    private Path diretorio;

    private Path arquivo;

    private CaminhoArquivo(Path diretorio, Path arquivo) {
        super();
        this.diretorio = diretorio;
        this.arquivo = arquivo;
    }

    public Path getDiretorio() {
        return diretorio;
    }

    public Path getArquivo() {
        return arquivo;
    }

    public static CaminhoArquivo getInstance(Integer id) {
        String b = "/tmp/";
        String d = null;

        if(id == null){
            d = ""; 
        }
        else{
            if (id <= 1000) {
                d = b + "1";
                } else if(id <= 2000){
                    d = b + "2";
                    }else{
                        d = b + "3";
                        }
        }
        return new CaminhoArquivo(Paths.get(d), Paths.get(d+"/"+id));

    }

}
