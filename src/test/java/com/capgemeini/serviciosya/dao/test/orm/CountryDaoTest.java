
package com.capgemeini.serviciosya.dao.test.orm;


import org.junit.Assert;
import org.junit.Test;

import com.capgemeini.serviciosya.beans.entity.CountryEntity;
import com.capgemeini.serviciosya.dao.ICountryDao;
import com.capgemeini.serviciosya.dao.orm.CountryDaoHibernate;

import java.util.List;


public class CountryDaoTest {


    private ICountryDao dao = new CountryDaoHibernate ();


    @Test
    public void testCreate () {

        CountryEntity c = new CountryEntity ();
        c.setName ("Venezuela");
        this.dao.create (c);

      Assert.assertNotNull ("Failure creating new country.", c.getId ());
    }

    @Test
    public void testUpdate () {

        CountryEntity c = new CountryEntity ();
        c.setId (3);
        c.setName ("ARGENTINA");
        this.dao.update (c);

        Assert.assertEquals ("Failure updating country.", "ARGENTINA", c.getName ());
    }

    @Test
    public void testDelete () {

        int id = 4;
        this.dao.delete (id);

        CountryEntity c = this.dao.findById (id);

        Assert.assertNull ("Failure deleting country.", c);
    }

    @Test
    public void testFindAll () {

        List<CountryEntity> list = this.dao.findAll ();

        list.forEach (System.out::println);

        Assert.assertFalse ("Failure find all countries.", list.isEmpty ());
    }
}