package Controlador.LibPDF;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.IOException;

public class NewPdf {
    private PDDocument OpenPdfs;
    private  String ruta;

    public NewPdf(String ruta){
        this.ruta=ruta;
    }

    public PDDocument NewPDDPdf () throws IOException {
        OpenPdfs = Loader.loadPDF(new RandomAccessReadBufferedFile(ruta));
        return OpenPdfs;
    }

}
