package homework_27.marathon.document_archive_marathon;
import homework_27.marathon.document_archive_marathon.controller.Archive;
import homework_27.marathon.document_archive_marathon.model.Document;

public class ArchiveAppl {
    public static void main(String[] args) {
        Archive archive = new Archive(4);
        Document[] shelf = new Document[3];
        shelf[0] = new Document(1000000001, "A1", 2013, "Birth certificate");
        shelf[1] = new Document(1000000002, "A2", 2016, "CV");
        shelf[2] = new Document(1000000003, "A3", 2014, "Secret document");

        for (int i = 0; i < 3; i++) {

            archive.addDocument(shelf[i]);
        }

        System.out.println("Документы: ");
        archive.printDocuments();

        System.out.println("-------------------------------------");
        Document foundByAuthor = archive.findDocumentByAuthor("A1");
        Document foundByName = archive.findDocumentByName("CV");
        System.out.println("Документ найденный по автору: " + foundByAuthor);
        System.out.println("Документ найденный по названию: " + foundByName);
    }



}

