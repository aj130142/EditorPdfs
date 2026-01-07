package Controlador.LibPDF;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

public class NewPdf {

    /* Este metodo sirve para abrir un pdf y guardarlo en tipo PDDocument */
    public PDDocument NewPDDPdf (String ruta) throws IOException {
        PDDocument OpenPdfs = Loader.loadPDF(new RandomAccessReadBufferedFile(ruta));
        return OpenPdfs;
    }
    public PDDocument loadEncrypPdf(String ruta,String pass)throws IOException{

        PDDocument OpenPdfs = Loader.loadPDF(new File(ruta),pass);
        return OpenPdfs;
    }


}
