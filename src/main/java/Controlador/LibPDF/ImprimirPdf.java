package Controlador.LibPDF;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPrintable;

import java.awt.*;
import java.awt.print.PrinterJob;
import java.io.File;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import java.util.ArrayList;
import java.util.List;

public class ImprimirPdf {
    public void imprimirPdfs(){

    }
    public PrintService[] hola(String adfa){
        PrintService[] impresoras  = PrintServiceLookup.lookupPrintServices(null, null);

        return impresoras;
    }
}
