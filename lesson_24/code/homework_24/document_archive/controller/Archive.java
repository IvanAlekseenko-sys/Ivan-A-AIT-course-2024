package homework_24.document_archive.controller;

import homework_24.document_archive.model.Document;

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

    public boolean addDocument(Document document) {
        // negative cases
        if (document == null) {
            return false;
        }
        if (size == documents.length) {
            return false;
        }
        if (!(findDocument(document.getId()) == null)) {
            return false;
        }
        // positive case
        documents[size] = document; // ставим книгу в конец массива, первое свободное место
        size++;
        return true;
    }

    public void printDocuments() {
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
    }

    public Document findDocument(int id) {
        for (int i = 0; i < size; i++) {
            if (documents[i].getId() == id) {
                return documents[i];
            }
        }
        return null;
    }

    public Document removeDocument(int id) {
        for (int i = 0; i < size; i++) {
            if (documents[i].getId() == id) {
                Document victim = documents[i];
                documents[i] = documents[size - 1];// last document put instead victim
                documents[size - 1] = null;// затираем последний элемент массива
                size--;
                return victim;
            }
        }
        return null;
    }

    // boolean updateDocument()

    public int size() {
        return size;
    }

}