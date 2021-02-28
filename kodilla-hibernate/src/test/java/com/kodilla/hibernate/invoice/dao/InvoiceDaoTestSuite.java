package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice1 = new Invoice("FV1/2/2021");
        Product product1 = new Product("ColourTV");
        Product product2 = new Product("Speakers");

        Item item1 = new Item(invoice1, product1, new BigDecimal(3000), 2);
        Item item2 = new Item(invoice1, product2, new BigDecimal(2000), 1);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice1);
        int id = invoice1.getId();
        BigDecimal value = invoice1.getItems().get(0).getValue();

        //Then
        assertNotEquals(0, id);
        assertEquals(new BigDecimal(6000), value);

        //CleanUp
        invoiceDao.deleteById(id);
        productDao.deleteAll();
    }
}
