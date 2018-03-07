package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //given
        Product product1 = new Product("Milk");
        Product product2 = new Product("Bread");
        Product product3 = new Product("Ham");

        Item item1 = new Item(product1, BigDecimal.valueOf(2),5);
        Item item2 = new Item(product2, BigDecimal.valueOf(3.5),2);
        Item item3 = new Item(product2, BigDecimal.valueOf(6.25),1);
        Item item4 = new Item(product3, BigDecimal.valueOf(22),2);

        product1.getItemList().add(item1);
        product2.getItemList().add(item2);
        product2.getItemList().add(item3);
        product3.getItemList().add(item4);

        List<Item> itemList1 = new ArrayList<>();
        List<Item> itemList2 = new ArrayList<>();
        itemList1.add(item1);
        itemList1.add(item3);
        itemList1.add(item4);
        itemList2.add(item1);
        itemList2.add(item2);

        Invoice invoice1 = new Invoice("First invoice",itemList1);
        Invoice invoice2 = new Invoice("Second invoice", itemList2);

        //When
        invoiceDao.save(invoice1);
        int invoice1ID = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2ID = invoice2.getId();

        //Then
        Assert.assertNotEquals(0,invoice1ID);
        Assert.assertNotEquals(0,invoice2ID);

        //CleanUp
        try {
            invoiceDao.delete(invoice1ID);
            invoiceDao.delete(invoice2ID);
        } catch (Exception e) {

        }

    }
}
