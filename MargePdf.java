package practice;


//import org.apache.pdfbox.multipdf.PDFMergerUtility;
//import javax.swing.*;
//import javax.swing.filechooser.FileNameExtensionFilter;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MargePdf extends JFrame {
//    private DefaultListModel<String> pdfListModel;
//    private JList<String> pdfList;
//    private JButton uploadButton, mergeButton;
//    private JTextField outputFileNameField;
//
//    public MargePdf() {
//        setTitle("PDF Merger");
//        setSize(500, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new BorderLayout());
//
//        pdfListModel = new DefaultListModel<>();
//        pdfList = new JList<>(pdfListModel);
//        JScrollPane scrollPane = new JScrollPane(pdfList);
//
//        uploadButton = new JButton("Upload PDF(s)");
//        uploadButton.setBounds(100,100,100,100);
//        mergeButton = new JButton("Merge PDFs");
//        outputFileNameField = new JTextField("merged_output.pdf");
//
//        JPanel bottomPanel = new JPanel();
//        bottomPanel.setLayout(new BorderLayout());
//        bottomPanel.add(new JLabel("Output File Name: "), BorderLayout.WEST);
//        bottomPanel.add(outputFileNameField, BorderLayout.CENTER);
//        bottomPanel.add(mergeButton, BorderLayout.EAST);
//
//        uploadButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFileChooser fileChooser = new JFileChooser();
//                fileChooser.setMultiSelectionEnabled(true);
//                fileChooser.setFileFilter(new FileNameExtensionFilter("PDF Files", "pdf"));
//
//                int returnValue = fileChooser.showOpenDialog(null);
//                if (returnValue == JFileChooser.APPROVE_OPTION) {
//                    File[] selectedFiles = fileChooser.getSelectedFiles();
//                    for (File file : selectedFiles) {
//                        pdfListModel.addElement(file.getAbsolutePath());
//                        System.out.println(file.getAbsolutePath());
//                    }
//                }
//            }
//        });
//
//        mergeButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                mergePDFs();
//            }
//        });
//
//        add(uploadButton, BorderLayout.NORTH);
//        add(scrollPane, BorderLayout.CENTER);
//        add(bottomPanel, BorderLayout.SOUTH);
//    }
//
//    private void mergePDFs() {
//        List<String> pdfFiles = new ArrayList<>();
//        for (int i = 0; i < pdfListModel.size(); i++) {
//            pdfFiles.add(pdfListModel.getElementAt(i));
//        }
//
//        if (pdfFiles.size() < 2) {
//            JOptionPane.showMessageDialog(this, "Select at least two PDF files!", "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        String outputFileName = outputFileNameField.getText().trim();
//        if (!outputFileName.endsWith(".pdf")) {
//            outputFileName += ".pdf";
//        }
//
//        PDFMergerUtility merger = new PDFMergerUtility();
//        merger.setDestinationFileName(outputFileName);
//
//        try {
//            for (String file : pdfFiles) {
//                merger.addSource(file);
//            }
//            merger.mergeDocuments(null);
//            JOptionPane.showMessageDialog(this, "PDFs merged successfully!\nSaved as: " + outputFileName);
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(this, "Error merging PDFs: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//        	MargePdf frame = new MargePdf();
//            frame.setVisible(true);
//        });
//    }
//}



//import org.apache.pdfbox.multipdf.PDFMergerUtility;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//
////user input
//public class Demo {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<String> pdfFiles = new ArrayList<>();
//
//        System.out.println("Enter PDF file paths (type 'done' when finished):");
//
//        // Take user input for PDF files
//        while (true) {
//            System.out.print("Enter file path: ");
//            String filePath = scanner.nextLine();
//
//            if (filePath.equalsIgnoreCase("done")) {
//                break; // Stop taking input when user types "done"
//            }
//
//            File file = new File(filePath);
//            if (file.exists() && file.isFile() && filePath.endsWith(".pdf")) {
//                pdfFiles.add(filePath);
//            } else {
//                System.out.println("Invalid file. Make sure it exists and is a PDF.");
//            }
//        }
//    
//
//        if (pdfFiles.size() < 2) {
//            System.out.println("You must enter at least two PDF files to merge.");
//            return;
//        }
//
//        System.out.print("Enter output file name (e.g., merged_output.pdf): ");
//        String outputFile = new Scanner(System.in).nextLine();
//
//        mergePDFs(pdfFiles, outputFile);
//    }
//
//    public static void mergePDFs(List<String> pdfFiles, String outputFileName) {
//        PDFMergerUtility merger = new PDFMergerUtility();
//        merger.setDestinationFileName(outputFileName);
//
//        try {
//            for (String file : pdfFiles) {
//                merger.addSource(file);
//            }
//
//            merger.mergeDocuments(null);
//            System.out.println("Merged PDF created: " + outputFileName);
//
//        } catch (IOException e) {
//            System.err.println("Error merging PDFs: " + e.getMessage());
//        }
//    }
//}
//






import org.apache.pdfbox.multipdf.PDFMergerUtility;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class MargePdf {
    public static void main(String[] args) {
    
        // List of PDF files to merge
//        List<String> pdfFiles = Arrays.asList("src/res/file1.pdf", "src/res/file2.pdf");
    	 List<String> pdfFiles = Arrays.asList("C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\1.pdf","C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\2.pdf",
    "C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\3.pdf","C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\4.pdf","C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\5.pdf",
    "C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\6.pdf","C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\9.pdf","C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\12.pdf","C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\13.pdf",
    "C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\16.pdf","C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\18.pdf","C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\19.pdf","C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\20.pdf");
    		
    		
        // Output file name
//        String outputPdf = "C:\\Users\\BISWAJIT\\Desktop\\margepdf\\merged_output10.pdf";
    	 String outputPdf = "C:\\Users\\BISWAJIT\\Desktop\\DNApdfs\\allDNApdfs.pdf";
        // Merge PDFs
        mergePDFs(pdfFiles, outputPdf);
    }

    public static void mergePDFs(List<String> pdfFiles, String outputPdf) {
        PDFMergerUtility pdfMerger = new PDFMergerUtility();
        pdfMerger.setDestinationFileName(outputPdf);

        try {
            // Add all PDFs to merge
            for (String pdf : pdfFiles) {
                pdfMerger.addSource(new File(pdf));
            }

            // Merge the PDFs
            pdfMerger.mergeDocuments(null);

            System.out.println("PDFs merged successfully into: " + outputPdf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for (String pdf : pdfFiles) {//check which destination save files
            File file = new File(pdf);
            if (!file.exists()) {
                System.out.println("Missing file: " + file.getAbsolutePath());
            } else {
                System.out.println("Found: " + file.getAbsolutePath());
            }
        }
    }
}
