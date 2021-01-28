package com.mycompany.app;
import com.aspose.words.Document;
import com.aspose.words.Paragraph;
import com.aspose.words.Section;
import com.aspose.words.DocumentBuilder;
import java.io.File;
import java.nio.file.Path;

public class manipulate_doc {

    String filePathDoc1;
    

    /*private void run(String inputFilePath, String outputDirectoryPath) {

        MSWordInspectionConfig config = new MSWordInspectionConfig();
        MSWordInspection msWordInspection = new MSWordInspection(config);
        msWordInspection.createInventory(inputFilePath, outputDirectoryPath);
      }
    */
    /*
      public void createInventory(String filePath, String outputDirectory) {
        String filenameModDoc = new File(filePath).getName();
        int lastPeriodPos = filenameModDoc.lastIndexOf('.');
        if (lastPeriodPos > 0) {
            filenameModDoc = filenameModDoc.substring(0, lastPeriodPos);
        }

        String filepathModDoc = Path.of(outputDirectory, "bookmarked_" + filenameModDoc + ".docx").toString();
        String filepathOutputReport = Path.of(outputDirectory, "inventory.json").toString();
        String dirExtractedImages = Path.of(outputDirectory, "images").toString();

        try {
            Document document = new Document(filePath);

            // Accept changes in document before processing
            document.acceptAllRevisions();
            // Remove all macros
            document.removeMacros();
            // Remove all comments
            NodeCollection comments = document.getChildNodes(NodeType.COMMENT, true);
            comments.clear();
            // Disable tracking
            document.setTrackRevisions(false);
            symbol2unicode(document);
            // try to reduce number of runs by removing not-needed formatting and collapsing runs with same formatting
            cleanup_document(document);
            // Remove all table of contents
            remove_toc(document);

            DocumentBuilder builder = new DocumentBuilder(document);

            profileDocument(document, builder, filepathModDoc, filepathOutputReport, dirExtractedImages);
        } catch (Exception e) {
            LOGGER.error("An exception occurred while inspecting MSWORD document", e);
        }

    }
    */
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

    public static void main(String[] args) throws Exception {

        //String licenseContent = args[0];
        //String submissionFilePath = args[1];
        //String outputDirectoryPath = args[2];
    
        // Load Aspose License
        //AsposeUtils.setAsposeWordLicense(licenseContent);
    
        //new manipulate_doc().run(submissionFilePath, outputDirectoryPath);

        String dataDir = getDataDir(manipulate_doc.class);
        Document doc = new Document(dataDir);
        System.out.println("This is the dataDir" + dataDir);

        // Open the document.
        
        //DocumentBuilder builder = new DocumentBuilder(doc);
        //builder.writeln("Hello World!, This is Stuart");
        //doc.save(dataDir + "HelloWorld_out_.docx");
        // System.out.println("New Word document created successfully.");

    }
    
}
