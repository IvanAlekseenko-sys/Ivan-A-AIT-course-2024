package homework_23.document_archive.controller;

import homework_23.document_archive.model.Document;

//Реализуйте класс Document и приложение Archive по аналогии с Book и Library.
// Уникальный номер документа содержит 10 цифр.
public class Archive {

    //fields
    private Document[] documents;
    private int size; //текущее количество документов


    //constructor

    public Archive(int capacity) {
        this.documents = new Document[capacity];
        this.size = 0;
    }
    // CRUD methods

    // boolean addDocument(Document documents)
    // size++

    // void printDocuments()


    public Document findDocument(int id){

        Document foundDocument = null;

        return foundDocument;
    }



    // Document removeDocument(int id )
    // size--

    // boolean updateDocument()


    public int size(){
        return size;
    }
}
