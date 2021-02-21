package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

//@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice1 = new Invoice("FV1/2/2021");
        Item item1 = new Item(new Product("ColourTV"), new BigDecimal(3000), 2);
        Item item2 = new Item(new Product("Speakers"), new BigDecimal(2000), 1);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);


        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();
        BigDecimal value = invoice1.getItems().get(0).getValue();
        //Then
        assertNotEquals(0, id);
        assertEquals(6000, value);
        //CleanUp
        invoiceDao.deleteById(id);
    }
}
