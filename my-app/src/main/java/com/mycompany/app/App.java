package com.mycompany.app;
import com.aspose.words.Document;
import com.aspose.words.Paragraph;
import com.aspose.words.Section;
import com.aspose.words.DocumentBuilder;
//import com.aspose.words.utils.*;
import java.io.File;

//import com.aspose.words.Node;


// package main.java.com.mycompany.app;
/**
 * Hello world!
 *
 */
public class App 
{
    public static String getDataDir(Class c) {
        File dir = new File(System.getProperty("user.dir"));
        dir = new File(dir, "src");
        dir = new File(dir, "main");
        dir = new File(dir, "resources");

        for (String s : c.getName().split("\\.")) {
            dir = new File(dir, s);
            if (dir.isDirectory() == false)
                dir.mkdir();
        }
        System.out.println("Using data directory: " + dir.toString());
        return dir.toString() + File.separator;
    }
    public static void main( String[] args) throws Exception
    {
        
        String dataDir = getDataDir(App.class);
        // Open the document.
        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);
        builder.writeln("Hello World!, This is Stuart");
        doc.save(dataDir + "HelloWorld_out_.docx");
        System.out.println("New Word document created successfully.");
        //Paragraph para = new Paragraph(doc);
        //Section section = doc.getLastSection();
        //section.getBody().appendChild(para);
        // Create a print job to print our document with.
        // PrinterJob pj = PrinterJob.getPrinterJob();
        
        // Initialize an attribute set with the number of pages in the document.
        //PrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();
        //attributes.add(new PageRanges(1, doc.getPageCount()));
        
        // Pass the printer settings along with the other parameters to the print document.
       // MultipagePrintDocument awPrintDoc = new MultipagePrintDocument(doc, 4, true, attributes);
        
        // Pass the document to be printed using the print job.
        //pj.setPrintable(awPrintDoc);
        
        //pj.print();
        System.out.println( "Hello World!" );
    }
}
