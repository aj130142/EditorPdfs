package Controlador.LibPDF;

import org.apache.pdfbox.pdmodel.PDDocument;

public class OperacionPdf {



    public PDDocument  RemoverPag(int inicio, int fin, PDDocument DocPdf){

        if(fin==0 ){

            DocPdf.removePage(inicio);
        }
        else {
            for(int i= inicio;i<fin;i++)
            DocPdf.removePage(inicio);
        }

        return DocPdf;
    }
}
