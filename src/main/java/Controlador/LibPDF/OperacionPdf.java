package Controlador.LibPDF;
import java.awt.print.PrinterJob;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.File;
import java.util.List;
import java.io.IOException;


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

    public PDDocument simpleMergePdf(PDDocument docPdf,PDDocument docPdf2,String rutaGuardadoPdf) throws IOException {
        PrinterJob job = PrinterJob.getPrinterJob();


        PDFMergerUtility PDFmerger = new PDFMergerUtility();
        PDFmerger.appendDocument(docPdf,docPdf2);
        docPdf.save(rutaGuardadoPdf);

        return  docPdf;
    }
    public  void mergeLargePDFs(List<String> files, String outputPath) throws IOException {

        PDFMergerUtility PDFmerger = new PDFMergerUtility();

        PDFmerger.setDestinationFileName(outputPath);
        File file1;
        for(String file:files){
            file1 = new File(file);
            PDFmerger.addSource(file1);
        }

        PDFmerger.mergeDocuments(null);
        System.out.println("Documents merged");
    }
    public void splitPdf(PDDocument docPDf){

    }

}
