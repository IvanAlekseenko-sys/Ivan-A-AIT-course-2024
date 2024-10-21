package homework_27.marathon.first_try.document_archive_marathon.controller;

import homework_27.marathon.first_try.document_archive_marathon.model.Document;

public interface ArchiveInterface {

    boolean addDocument(Document document);
    void printDocuments();
    Document findDocument(int id);
    Document removeDocument(int id);
    Document findDocumentByAuthor (String author);
    Document findDocumentByName (String name);




}
