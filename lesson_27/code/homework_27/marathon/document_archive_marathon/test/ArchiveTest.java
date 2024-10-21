package homework_27.marathon.document_archive_marathon.test;

import homework_27.marathon.document_archive_marathon.controller.Archive;
import homework_27.marathon.document_archive_marathon.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveTest {
    Archive archive;
    Document[] documents;

    @BeforeEach
    void setUp() {
        archive = new Archive(5);
        documents = new Document[5];
        documents[0] = new Document(1000000001, "A1", 2013, "Birth certificate");
        documents[1] = new Document(1000000002, "A2", 2014, "CV");
        documents[2] = new Document(1000000003, "A3", 2004,"Marriage certificate");
        documents[3] = new Document(1000000004, "A4", 2003,"Secret document");

        // Добавляем документы в архив
        for (int i = 0; i < 4; i++) { // добавляем только 4 документа
            archive.addDocument(documents[i]);
        }
    }

    @Test
    void addDocumentTest() {
        // Не добавлять null
        assertFalse(archive.addDocument(null));
        // Не добавлять дубликат
        assertFalse(archive.addDocument(documents[3]));
        // Добавляем новый документ
        Document newDocument = new Document(1000000005, "A5", 2024,"Abc");
        assertTrue(archive.addDocument(newDocument));
        assertEquals(5, archive.size());
        // Не добавлять документ сверх capacity
        Document oneMoreDocument = new Document(1000000006, "A6", 2024,"Unknown");
        assertFalse(archive.addDocument(oneMoreDocument));
    }

    @Test
    void findDocumentTest() {
        // Проверяем нахождение существующего документа
        assertEquals(documents[0], archive.findDocument(1000000001));
        // Проверяем нахождение несуществующего документа
        assertNull(archive.findDocument(1000000008));
    }
    @Test
    void findDocumentTestByAuthor() {
        // Проверяем нахождение существующего документа
        assertEquals(documents[0], archive.findDocumentByAuthor("A1"));
        // Проверяем нахождение несуществующего документа
        assertNull(archive.findDocumentByAuthor("Tyutchev"));
    }
    @Test
    void findDocumentTestByName() {
        // Проверяем нахождение существующего документа
        assertEquals(documents[0], archive.findDocumentByName("Birth certificate"));
        // Проверяем нахождение несуществующего документа
        assertNull(archive.findDocumentByName("N66"));
    }

    @Test
    void removeDocumentTest() {
        // Удаляем существующий документ
        assertEquals(documents[0], archive.removeDocument(1000000001));
        assertEquals(3, archive.size());
        // Пытаемся удалить несуществующий документ
        assertNull(archive.removeDocument(1000000009));
    }

    @Test
    void sizeTest() {
        assertEquals(4, archive.size());
    }

    @Test
    void printDocumentsTest() {
        System.out.println("=========================");
        archive.printDocuments();
    }
}
